package Scrollupdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_scrollIntoViewFlipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",facebook);
		Thread.sleep(2000);
		WebElement grocary = driver.findElement(By.xpath("(//div[@class='_1mkliO'])[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);",grocary);
	}

}
