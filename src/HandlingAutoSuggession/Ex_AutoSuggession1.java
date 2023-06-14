package HandlingAutoSuggession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_AutoSuggession1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allOptins = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		String expText="selenium sulfide shampoo";
		for(WebElement s1:allOptins)
		{
			String actText=s1.getText();
			if(actText.equals(expText))
			{
				s1.click();
				break;
			}
			
		}
		
	}

}
