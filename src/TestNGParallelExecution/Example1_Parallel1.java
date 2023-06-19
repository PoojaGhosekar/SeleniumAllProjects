package TestNGParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1_Parallel1 {
	@Test
	public void TC1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.quit();
		Thread.sleep(4000);
	}
	

}
