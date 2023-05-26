package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ex_MouseOver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
//		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
//		//step1
//		Actions act=new Actions(driver); 
//		//step2(take selenium pointer to logon button)
//		act.moveToElement(login).perform();;
//		Thread.sleep(2000);
		//click on wishlist
		//driver.findElement(By.xpath("(//a[@class='_2kxeIr _1pY_1Z'])[4]")).click();
		
	    WebElement more = driver.findElement(By.xpath("(//div[@class='go_DOp'])[2]"));
	    Actions act=new Actions(driver);
	    act.moveToElement(more).perform();
			
		
	}

}
