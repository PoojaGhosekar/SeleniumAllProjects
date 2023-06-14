package WebdriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExEnterDataWithoutSendkeys {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
((JavascriptExecutor)driver).executeScript("document.getElementById('email').value='pooja'");
//WebElement s = driver.findElement(By.id("email"));
//String val = s.getAttribute("value");
//System.out.println("value entered "+val);
		
	}

}
