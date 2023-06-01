package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_locatorusingxpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//click on signup page
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		Thread.sleep(2000);
		
		//click on create new account
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		Thread.sleep(2000);
		
		//enter first and last name
		driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("Pooja Ghosekar");
		Thread.sleep(2000);
		
		//enter  mobile no
		driver.findElement(By.xpath("//input[@placeholder='Mobile number']")).sendKeys("9673408231");
		Thread.sleep(2000);
		
		
		
		//enter  password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sept@2023");
        Thread.sleep(2000);
        
      //click on continue
      	driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
      	Thread.sleep(2000);
      		
      		
//      //click on solve puzzle
//      	driver.findElement(By.xpath("//button[contains(text(),'Solve')]")).click();
//      	Thread.sleep(2000);
	}

}
