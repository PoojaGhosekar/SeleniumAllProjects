package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_navigate_to {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Allow all cookies']")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();;
//		Thread.sleep(2000);
//		
//		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.close();
		
		
	}

}
