package Locator;
//xpath by contains using text
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_xpathByContainText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//finding xpath by text using contains
		driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
	}

}
