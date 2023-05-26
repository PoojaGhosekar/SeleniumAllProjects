package Locator;
//finding xpath by attribute
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_xpathByTagname {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//finding xpath of username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pooja.goswade@gmail.com");
		//finding xpath of password
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc");
		//finding xpath of login
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
