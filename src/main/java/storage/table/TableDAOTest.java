package storage.table;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TableDAOTest {
   TableDAO tabledao = new TableDAO();
   Table table = new Table();
   
   @Test
   public void testtableID() {
      //처음에는 마지막테이블 번호다음번호 8번리턴
      assertEquals(7, tabledao.tableID());
   }
   
   @Test
   public void testinsertTable() {
	   table.setTableID(tabledao.tableID());
		table.setTableName("");
		table.setTablePeople(0);
		table.setTableContent("");
      assertEquals(1, tabledao.insertTable(table.getTableID()));
   }
   @Test
   public void testmanageTableInfo() {
      assertEquals(1, tabledao.manageTableInfo(5, "새로운 테이블", 8, "테스트테이블입니다."));
   }
   @Test
   public void testdeleteTable() {
      assertEquals(1, tabledao.deleteTable(6));
   }
   
   @Test
   public void testgetTableInfo() {
	   assertNotNull(tabledao.getTableInfo(1));
   }
   
   @Test
   public void testgetAllTables() {
      assertNotNull(tabledao.getAllTables());
   }
}

