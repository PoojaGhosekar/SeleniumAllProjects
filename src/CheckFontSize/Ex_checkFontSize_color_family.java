package CheckFontSize;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_checkFontSize_color_family {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		System.out.println(login.getCssValue("font-size"));
		System.out.println(login.getCssValue("color"));
		System.out.println(login.getCssValue("font-family"));
		System.out.println(driver.getTitle());
	}

}
