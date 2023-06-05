package PomWithPageFactoryUsingChilBrowserWindow;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CHHomePage {
	@FindBy(xpath="//input[@name='NewTab']")private WebElement newtab;
	@FindBy(xpath="//input[@name='NewWindow']")private WebElement newWindow;
	WebDriver driver1;
	public CHHomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void switchToMain()
	{
		Set<String> allid = driver1.getWindowHandles();
		ArrayList<String>al=new ArrayList<>(allid);
		
		driver1.switchTo().window(al.get(0));
//		System.out.println(al.get(1));
//		System.out.println(al.get(0));
	}
	public void CHclickOnNewTab()
	{
		newtab.click();
	}
	public void CHclickOnNewWindow()
	{
		newWindow.click();
	}

}
