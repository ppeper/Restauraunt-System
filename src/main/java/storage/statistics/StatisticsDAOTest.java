package storage.statistics;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StatisticsDAOTest {
   Statistics statistics = new Statistics();
   StatisticsDAO statisticsdao = new StatisticsDAO();

   @Test
   public void testgetTodayStat() {
       //성공시 1리턴
       assertEquals(1, statisticsdao.getTodayStat(statistics));
   }
   @Test
   public void testgetWeekStat() {
      //성공시 1리턴
      assertEquals(1, statisticsdao.getWeekStat(statistics));
   }
   @Test
   public void testgetMonthStat() {
      //성공시 1리턴
      assertEquals(1, statisticsdao.getMonthStat(statistics));
   }
   @Test
   public void testgetTableCount() {
      //성공시 1리턴
      assertEquals(1, statisticsdao.getTableCount(statistics));
   }
   @Test
   public void testgetEachMonthStatistics() {
      //6월달에 예약자가 5명이다 -> 5면 테스트통과
      assertEquals(5, statisticsdao.getEachMonthStatistics("06"));
   }
   @Test
   public void testgetEachMonthTotal() {
      //6월달 예약자의 총인원이 10명이다.
      assertEquals(10, statisticsdao.getEachMonthTotal("06"));
   }
   @Test
   public void testgetAgeStatistics() {
      //데이터베이스에서 20대인 사용자는 24명이다 -> 24명이면 테스트통과
      assertEquals(24, statisticsdao.getAgeStatistics(20));
   }
   @Test
   public void testgetAllUser() {
      //사용자들의 총수가 29명이다.
      assertEquals(29, statisticsdao.getAllUser());
   }
   @Test
   public void testgetGenderStatistics() {
      //지금 사용자중 데이터베이스에 여자는 13명
      assertEquals(13, statisticsdao.getGenderStatistics("여자"));
      //지금 사용자중 데이터베이스에 남자는 16명
      assertEquals(16, statisticsdao.getGenderStatistics("남자"));
   }
   @Test
   public void testgetUnderAgeStatistics() {
      //데이터베이스상 6월달 ageUnder인원이 2명
      assertEquals(2, statisticsdao.getUnderAgeStatistics("06"));
   }
}

