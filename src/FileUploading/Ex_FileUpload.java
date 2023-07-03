package FileUploading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement file = driver.findElement(By.xpath("//input[@type='file']"));
		file.sendKeys("C:\\pooja\\ravi.png");
		Thread.sleep(2000);
		driver.close();
	}

}
