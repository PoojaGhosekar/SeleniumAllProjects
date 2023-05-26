package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_dropDown2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		//WebElement chageLoc = driver.findElement(By.xpath("//input[@value='Change Location']"));
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}

}
