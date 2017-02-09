package test.task.v3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="mailbox__login")
	private WebElement login;
	
	@FindBy(id="mailbox__login__domain")
	private WebElement domain;
	
	@FindBy(id="mailbox__password")
	private WebElement password;
	
	public boolean isInitialized() {
		return login.isDisplayed();
	}
	
	public void enterCredentials(String email, String passw)	{
		String[] login_domain = {"not found", "not found"};
		login_domain = C.separator(email);
		this.login.clear();
		this.login.sendKeys(login_domain[0]);
		
		this.password.clear();
		this.password.sendKeys(login_domain[1]);
	}
	
	public HomePage login()	{
		this.password.sendKeys(Keys.ENTER);
		return new HomePage(driver);
	}
	

}
