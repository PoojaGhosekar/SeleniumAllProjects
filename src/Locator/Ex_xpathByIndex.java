package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_xpathByIndex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Laptop");
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//xpath for create new account 
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		// xpath by index for firstName
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Pooja");
	     
		// xpath by index for firstName
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		//(//input[@type='radio'])[2]
	}
	

}
