package PomWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZRegistrationPage {
	@FindBy(xpath="//input[@name='customerName']")private WebElement name;
	@FindBy(xpath="//input[@placeholder='Mobile number']")private WebElement mno;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;
	@FindBy(xpath="//input[@class='a-button-input']")private WebElement continuebutton;
	public AZRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void registerAccount()
	{
		name.sendKeys("Pooja Ghosekar");
		mno.sendKeys("9673408231");
		pwd.sendKeys("Sept@2023");
		continuebutton.click();
	}
	
	

}
