package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\ScreenShots\\firstScreen.jpg");
		FileHandler.copy(src, dest);
		System.out.println(dest);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		File srcCreate=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destCreate=new File("C:\\\\pooja\\\\VelocitySoftwareTesting\\\\AUTOMATION\\\\ScreenShots\\CreateNewAccount.jpg");
		FileHandler.copy(srcCreate, destCreate);
		System.out.println(destCreate);
		
	}

}
