package test.task.v3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MailRuTest extends FunctionalTest {
	
	@Test
	public void signUpAndSend()	{
		driver.get(C.site_name);
		
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isInitialized());
		
		loginPage.enterCredentials(C.email, C.password);
		
		HomePage homePage = loginPage.login();
		assertTrue(homePage.isInitialized());
		
		homePage.newMail();
		homePage.typeAddresse(C.addressee);
		homePage.typeSubject(C.subject);
		homePage.typeText(C.text);
		homePage.sendMail();
		
	}

}
