package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.RandomAccess;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Ex_RandomString {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String rs=RandomString.make(2);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\\\pooja\\\\VelocitySoftwareTesting\\\\AUTOMATION\\\\ScreenShots\\LoginScreen "+rs+".jpg");
		FileHandler.copy(src, dest);
		
	}

}
