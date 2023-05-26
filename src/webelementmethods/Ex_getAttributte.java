package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_getAttributte {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'sign in')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First and last name']")).sendKeys("pooja");;
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//input[@placeholder='First and last name']")).getAttribute("value");
		System.out.println(text);
	}

}
