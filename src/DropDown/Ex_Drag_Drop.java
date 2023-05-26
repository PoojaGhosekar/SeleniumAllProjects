package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_Drag_Drop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement srctext = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement desttext = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(srctext, desttext).perform();
	}

}
