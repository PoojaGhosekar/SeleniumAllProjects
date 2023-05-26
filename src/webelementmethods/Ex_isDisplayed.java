package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_isDisplayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		boolean result=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		if(result)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("Logo is not present");
		}
	}

}
