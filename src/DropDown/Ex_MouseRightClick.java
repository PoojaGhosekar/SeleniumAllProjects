package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_MouseRightClick {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	//driver.switchTo().frame("iframe[@id='gdpr-consent-notice']");
	//driver.findElement(By.xpath("//span[text()='Accept All']")).click();
	WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	act.moveToElement(rightclick).perform();
	act.contextClick().perform();
	
	//act.moveToElement(rightclick).contextClick().perform();
	
	//act.contextClick(rightclick).perform();
	//iframe[@id='gdpr-consent-notice']
	}
}
