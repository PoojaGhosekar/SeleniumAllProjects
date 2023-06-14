package HandlingAutoSuggession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_AutoSuggessionInFlipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		List<WebElement> alloptions = driver.findElements(By.xpath("//input[@type='text']"));
		String exptext="selenium 200";
		for(WebElement s1:alloptions)
		{
			String value = s1.getText();
			if(value.equals(exptext))
			{
				s1.click();
				break;
			}
		}
	}

}
