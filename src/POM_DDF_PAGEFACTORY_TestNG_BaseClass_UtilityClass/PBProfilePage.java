package POM_DDF_PAGEFACTORY_TestNG_BaseClass_UtilityClass;



import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage {
	@FindBy(xpath="//input[@name='personName']")private WebElement fullName;
	WebDriver driver1;
	
	public PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void switchToChildWindow()
	{
		Set<String> allId=driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allId);
		driver1.switchTo().window(al.get(1));
	}
	public String getPBProfilePageFullName()
	{
		String actFullName=fullName.getAttribute("value");
		return actFullName;
	}

}
