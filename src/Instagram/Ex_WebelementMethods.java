package Instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_WebelementMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		//enter username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pooja.goswade@gmail.com");
		Thread.sleep(2000);
		
		//enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sept12345");
		Thread.sleep(4000);
		
		//click on login
        driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();;
		//System.out.println(result);
		
		//driver.findElement(By.xpath("//span[contains(text(),'Facebook')]")).click();
	}

}
