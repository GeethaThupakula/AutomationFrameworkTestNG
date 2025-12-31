package tests;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	import base.BaseTest;
	import pages.LoginPage;

	public class LoginTest extends BaseTest {
		
		
		@Test
		public void testValidateLogin() {
			
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterusername("admin@yourstore.com");
			loginpage.enterpassword("admin");
			loginpage.clickLogin();
			
			System.out.println("Title of the page is "+ driver.getTitle());
			Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
			
		}
	

	}
