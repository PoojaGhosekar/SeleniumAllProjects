
package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_isEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		boolean result=driver.findElement(By.xpath("//a[text()='Create new account']")).isEnabled();
		
		if(result)
		{
			System.out.println("button is enabled");
			
		}
		else
		{
			System.out.println("Button is disabled");
		}
		Thread.sleep(2000);
		
//		WebElement femaleradiobtn=driver.findElement(By.xpath("//input[@name='sex']"));
//		System.out.println(femaleradiobtn.isEnabled());
	}

}
