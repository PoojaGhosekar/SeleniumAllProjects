package Scrollupdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_Copyandpaste {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		fname.sendKeys("Pooja");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		//control+a
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(2000);
		//control+c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(2000);
		
		//tab
		act.sendKeys(Keys.TAB);
		act.perform();
		Thread.sleep(2000);
		//control+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(2000);
	}

}
