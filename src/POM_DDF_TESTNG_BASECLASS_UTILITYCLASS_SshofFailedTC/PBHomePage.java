package POM_DDF_TESTNG_BASECLASS_UTILITYCLASS_SshofFailedTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage {
	@FindBy(xpath="//div[text()='My Account']")private WebElement myAcc;
	@FindBy(xpath="//span[text()='Sign out']")private WebElement signOut;
	WebDriver driver1;
	public PBHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void openDDOptionPBHomePagemyAcc()
	{
		Actions act=new Actions(driver1);
		act.moveToElement(myAcc).perform();
	}
	public void clickSignOutPBHomePage()
	{
		signOut.click();
	}

}
