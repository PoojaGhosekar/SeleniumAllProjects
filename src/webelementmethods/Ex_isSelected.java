package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_isSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement fn=driver.findElement(By.xpath("//input[@name='sex']"));
		System.out.println(fn.isSelected());
		Boolean result=fn.isSelected();
		if(result)
		{
			System.out.println("Button is selected");
		}
		else
		{
			System.out.println("Button is deselected");
		}
	}

}
