package PomWithPageFactoryAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZLoginPage {
	@FindBy(xpath="//span[text()='Account & Lists']") private WebElement signIn;
	public AMZLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnSignIn()
	{
		signIn.click();
	}

}
