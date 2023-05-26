package Scrollupdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_scrollIntoView {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement instagram = driver.findElement(By.xpath("//a[text()='Instagram']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",instagram);
	Thread.sleep(2000);
	WebElement mobiletab = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", mobiletab);
	//a[text()='Mobiles']
	//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-200)");

}
}
//a[text()='Instagram']