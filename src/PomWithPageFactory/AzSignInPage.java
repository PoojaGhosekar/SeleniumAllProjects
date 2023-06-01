package PomWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AzSignInPage {
	@FindBy(xpath="//span[text()='Hello, sign in']") private WebElement signIn;
	public AzSignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnSignIn()
	{
		signIn.click();
	}

}
