package HandlingOfMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_selectMultipleCheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\HTML\\MultiCheck.html");
		Thread.sleep(2000);
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allcheckbox.size());
		for(WebElement s1:allcheckbox)
		{
			s1.click();
			Thread.sleep(1000);
		}
		
	}

}
