package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_Alert_clickOkButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
        Thread.sleep(2000);
		//enter some cust id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
		Thread.sleep(2000);
		//click on submit
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		
		////switch to alert popup
		Alert alt = driver.switchTo().alert();
		//click on ok buttoon from 1st alert popoup
		alt.accept();
		Thread.sleep(2000);
		//click on ok buttoon from 2nd alert popoup
		alt.accept();
		
		
	}

}
