package HandlingCustomizeListbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_Select_hridhanbirthdate {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//month
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	//day
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	//year
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Actions act =new Actions(driver);
	act.click(month).perform();
	//month
	act.sendKeys(Keys.END).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ENTER).perform();
	String monthvalue = month.getAttribute("value");
	//day
	act.click(day).perform();
	
	act.sendKeys(Keys.HOME).perform();
	for(int i=1;i<=7;i++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
	}
	act.sendKeys(Keys.ENTER).perform();
	String dayvalue = day.getAttribute("value");
	//year
	act.click(year).perform();
	for(int j=1;j<=8;j++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
	}
	act.sendKeys(Keys.ENTER).perform();
	String yearvalue = year.getAttribute("value");
	System.out.println("Hridhan Birthdate is : "+dayvalue+"/"+monthvalue+"/"+yearvalue);
}

}
