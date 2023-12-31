package POM_DDF_TESTNG_BASECLASS_UTILITYCLASS_SshofFailedTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage {
	@FindBy(xpath="//span[text()=' My profile ']")private WebElement myProfile;
	public PBMyAccPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickPBMyAccPageMYProfile()
	{
		myProfile.click();
	}

}
