package HandlingAutoSuggession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_AutoSuggessionSnapdeal {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("kurti");
		Thread.sleep(2000);
		List<WebElement> alloptions = driver.findElements(By.xpath("//a[@class='subdiv unStructured searchKeyWord']"));
		String exptext="Cotton Kurti";
		for(WebElement s1:alloptions)
		{
			String acttext = s1.getText();
			if(acttext.equals(exptext))
			{
				s1.click();
				break;
			}
		}
	}
	
}
