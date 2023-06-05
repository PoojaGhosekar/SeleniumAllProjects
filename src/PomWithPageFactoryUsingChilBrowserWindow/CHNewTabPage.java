package PomWithPageFactoryUsingChilBrowserWindow;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CHNewTabPage {
	@FindBy(xpath="(//span[text()='Training'])[1]")private WebElement training;
	WebDriver driver1;
	public CHNewTabPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void switchToChild()
	{
		Set<String> allid = driver1.getWindowHandles();
		ArrayList<String>al=new ArrayList<>(allid);
		
		driver1.switchTo().window(al.get(1));
		System.out.println(al.get(1));
		System.out.println(al.get(0));
	}
	
	public void ChClickOnTraining()
	{
		training.click();
	}

}
