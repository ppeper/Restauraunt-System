package storage.booking;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import storage.user.*;
class BookingDAOTest {
	BookingDAO bookingdao = new BookingDAO();
	Booking booking = new Booking(); User user = new User();
	@Test
	public void testreservation() {
		booking.setUserID("rlathrhd");
		booking.setUserPhone("01051328495");
		booking.setBookingDateTime("2021-06-20 17:00:00");
		booking.setAgeOver(1);
		booking.setAgeUnder(1);
		booking.setTableID(1);
		booking.setCarNumber("01자4847");
		booking.setNotCancel(1);
		assertEquals(1, bookingdao.reservation(booking.getUserID(), booking.getUserPhone(),
				booking.getBookingDateTime(), booking.getAgeOver(), booking.getAgeUnder(),
				booking.getTableID(), booking.getCarNumber(), booking.getNotCancel()));
	}
	@Test
	public void testreservation2() {
		booking.setUserID("wjdwogjs");
		booking.setUserPhone("01051328495");
		booking.setBookingDateTime("2021-06-20 17:00:00");
		booking.setAgeOver(1);
		booking.setAgeUnder(1);
		booking.setTableID(2);
		booking.setCarNumber("01이8888");
		booking.setNotCancel(1);
		assertEquals(1, bookingdao.reservation(booking.getUserID(), booking.getUserPhone(),
				booking.getBookingDateTime(), booking.getAgeOver(), booking.getAgeUnder(),
				booking.getTableID(), booking.getCarNumber(), booking.getNotCancel()));
	}
	@Test
	public void testgetMyTable() {
		assertNotNull(bookingdao.getMyTable(2));
	}
	@Test
	public void testgetUsableTable1() {
		assertEquals(1, bookingdao.getUsableTable("2021-06-20T18:00:00", 1));
	}
	@Test
	public void testgetUsableTable2() {
		assertEquals(1, bookingdao.getUsableTable("2021-06-20T18:00:00", 2));
	}
	@Test
	public void testgetNotUsableTable() {
		assertEquals(-1, bookingdao.getUsableTable("2021-06-05T18:10:00", 1));
	}
	@Test
	public void testcheckReservationInfo() {
		assertNotNull(bookingdao.checkReservationInfo("rlathrhd"));
	}
	@Test
	public void testgetReservationInfo() {
		assertNotNull(bookingdao.getReservationInfo("ggg"));
	}
	@Test
	public void testcancel() {
		assertEquals(1, bookingdao.cancel(user.getUserPoint()-1000,"rlathrhd"));
	}
	@Test
	public void testgetBookingAll() {
		assertNotNull(bookingdao.getBookingAll());
	}
	@Test
	   public void testgetUserName() {
	      assertEquals("홍길동",bookingdao.getUserName("abcd"));
	   }
	@Test
	public void testupdateReservation() {
		booking.setBookingDateTime("2021-06-20 20:00:00");
		booking.setAgeOver(2);
		booking.setAgeUnder(0);
		booking.setTableID(1);
		booking.setCarNumber("02거4885");
		booking.setUserID("hhh");
		assertEquals(1, bookingdao.updateReservation(
				booking.getBookingDateTime(), booking.getAgeOver(), booking.getAgeUnder(),
				booking.getTableID(), booking.getCarNumber(), booking.getUserID()));
	}
	@Test
	public void testgetMostTable() {
		assertNotNull(bookingdao.getMostTable());
	}
}