package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_Alert_getText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		//switch to alert popup
        Thread.sleep(2000);
		//enter some cust id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
		//click on submit
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		
		
		
		
	}

}
