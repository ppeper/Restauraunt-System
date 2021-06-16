package storage.user;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserDAOTest {
	UserDAO userdao = new UserDAO();
	User user = new User();

	@Test
	   public void testjoin() {
	      user.setUserID("javakim");
	      user.setUserPassword("java1234");
	      user.setUserName("김자바");
	      user.setUserPhone("01012345678");
	      user.setUserGender("여자");
	      user.setUserBirth("19961120");
	      user.setUserEmail("java@naver.com");
	      user.setUserPoint(0);
	      user.setUserAuthority("USER");
	      assertEquals(1, userdao.join(user));
	      
	   }
	@Test
	void testlogin() {
		assertEquals(1, userdao.login("wjdwogjs","qwer1234"));
		assertEquals(1, userdao.login("ADMIN","1234"));
	}
	@Test
	public void testgetUserInfo() {
		assertNotNull(userdao.getUserInfo("wjdwogjs"));
	}
	@Test
	public void testcheckUserAuthority() {
		assertEquals(1, userdao.checkUserAuthority("ADMIN"));
	}
	@Test
	public void testeditInfoPassword() {
		assertEquals(1, userdao.editInfoPassword("1234java","javakim"));
	}
	@Test
	public void testeditInfoName() {
		assertEquals(1, userdao.editInfoName("김파이썬","javakim"));
	}
	@Test
	public void testeditInfoEmail() {
		assertEquals(1, userdao.editInfoEmail("python123@naver.com","javakim"));
	}
	@Test
	public void testeditInfoPhone() {
		assertEquals(1, userdao.editInfoPhone("01051948265","javakim"));
	}
	@Test
	public void testdeleteMember() {
		assertEquals(1, userdao.deleteMember("javakim"));
	}
	@Test
	public void testgetMemberAll() {
		assertNotNull(userdao.getMemberAll());
	}
}


