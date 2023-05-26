package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverGetEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		
//		driver.navigate().to("https://www.snapdeal.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		
	}
}
