package storage.waiting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class WaitingDAOTest {
   WaitingDAO waitingdao = new WaitingDAO();
   Waiting waiting = new Waiting();
   @Test
   public void testreservationWaiting() {
      waiting.setUserID("abcd");
      waiting.setUserPhone("01012345678");
      waiting.setBookingDateTime("2021-06-06T01:13:00");
      waiting.setAgeOver(1);
      waiting.setAgeUnder(1);
      waiting.setTableID(1);
      waiting.setCarNumber("12가3456");
      waiting.setNotCancel(0);
      waiting.setPriority(1);
      assertEquals(1,waitingdao.reservationWaiting(waiting.getUserID(),
            waiting.getUserPhone(), waiting.getBookingDateTime(), waiting.getAgeOver(),
            waiting.getAgeUnder(), waiting.getTableID(),waiting.getCarNumber(),
            waiting.getNotCancel(), waiting.getPriority()));
      
   }
   @Test
   public void testcheckWaitingInfo() {
      assertEquals(1, waitingdao.checkWaitingInfo("bbbb"));
   }
   @Test
   public void testgetWaitingInfo() {
      assertNotNull(waitingdao.getWaitingInfo("cccc"));
         
   }
   @Test
   public void testpriority() {
      assertEquals(0,waiting.getPriority());
   }
   @Test
   public void testreturnWaitPeople() {
      assertNotNull(waitingdao.returnWaitPeople(5));
   }
   @Test
   public void testgetAbleWaiting() {
      //해당 데이터가 있는경우
      assertEquals(1, waitingdao.getAbleWaiting(2, "2021-06-06T01:12:00"));
      //해당 데이터가 없는경우
      assertEquals(1, waitingdao.getAbleWaiting(10, "2021-07-20T18:00:00"));
   }
   @Test
   public void testdeleteWaiting() {
      assertEquals(1, waitingdao.deleteWaiting(1));
   }
   @Test
   public void testcancelWaiting() {
      assertEquals(0, waitingdao.cancelWaiting("abcd"));
   }

   @Test
   public void testgetWaitingListAll() {
      assertNotNull(waitingdao.getWaitingListAll());
   }
}
