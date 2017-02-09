package test.task.v3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {
	
	@FindBy(css=".b-layout.b-layout_main")
	private WebElement mainLayout;
	
	@FindBy(xpath="html/body")
	private WebElement body;
	
	@FindBy(xpath="html/body/div[2]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div[1]/div/div/div[2]/div/div/div/textarea[2]")
	private WebElement addresse;
	
	@FindBy(xpath="html/body/div[2]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div[4]/div/div/div[2]/div/input")
	private WebElement subject;
	
	@FindBy(xpath="html/body/div[2]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[2]/div[2]/div/div/form/div[5]/div[1]/div/table/tbody/tr/td/table[1]/tbody/tr/td[20]/a/span[1]/span[2]")
	private WebElement unformatted;
	
	@FindBy(xpath="html/body/div[2]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[2]/div[2]/div/div/form/div[5]/div[2]/table/tbody/tr/td[1]/div[3]/div[1]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/textarea")
	private WebElement textArea;

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isInitialized() {
		return mainLayout.isDisplayed();
	}
	
	public void newMail()	{
		this.mainLayout.sendKeys("N");
	}
	
	public void typeAddresse(String addresse)	{
		this.addresse.clear();
		this.addresse.sendKeys(addresse);
	}
	
	public void typeSubject(String subject)	{
		this.subject.clear();
		this.subject.sendKeys(subject);
	}
	
	public void typeText(String text)	{
		this.unformatted.click();
		String signature = ""+this.textArea.getAttribute("value");
		this.textArea.clear();
		this.textArea.sendKeys(text+signature);
	}
	
	public void sendMail()	{
		String sendKeys = Keys.chord(Keys.CONTROL, Keys.ENTER);
		this.body.sendKeys(sendKeys);
	}
	
	
	

}
