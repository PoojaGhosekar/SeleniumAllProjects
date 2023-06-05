package PomWithPageFactoryAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZSignInPage {
	
	@FindBy(xpath="//input[@name='email']") private WebElement mno;
	@FindBy(xpath="//input[@id='continue']") private WebElement conti;
	
	public AMZSignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterMNO()
	{
		mno.sendKeys("919673408231");
	}
	public void clickOnContinue()
	{
		conti.click();;
	}


}
