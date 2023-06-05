package PomWithPageFactoryAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZPasswordPage {
	@FindBy(xpath="//input[@name='password']") private WebElement pwd;
	@FindBy(xpath="//input[@id='signInSubmit']")private WebElement signInButton;
	
	public AMZPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterPwd()
	{
		pwd.sendKeys("Sept@2023");
	}
	public void clickOnSignIn()
	{
		signInButton.click();
	}

}
