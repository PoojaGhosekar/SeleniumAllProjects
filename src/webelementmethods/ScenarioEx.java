package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/pooja/VelocitySoftwareTesting/AUTOMATION/HTML/webelement.html");
		Thread.sleep(2000);
   		WebElement passwd=driver.findElement(By.name("pwd"));
   		passwd.sendKeys("abc");
   		String password=passwd.getAttribute("value");
   		//System.out.println(password);
		WebElement confirmpwd=driver.findElement(By.name("cpwd"));
		confirmpwd.sendKeys("abc");
		String confirmpassword=confirmpwd.getAttribute("value");
		//System.out.println(confirmpassword);
		
		if(password.equals(confirmpassword))
		{
			System.out.println("passord is correct");
		}
		else
		{
			System.out.println("password is failed");
		}
	}

}
