package HandlingAutoSuggession;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesionGoogle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("redmi note 50");
		
		List<WebElement> alloptions=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String expText="redmi note 50";
		for(WebElement s1:alloptions)
		{
			String actText=s1.getText();
			System.out.println(actText);
			Thread.sleep(2000);
			if(actText.equals(expText))
			{
				s1.click();
				break;
			}
		}
	}

}
