package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_selectMultipleList {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bruxellesformation.brussels/catalogue-dorifor/?");
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allcheckboxes.size());
		for(WebElement s1:allcheckboxes)
		{
			System.out.println(s1.getText());
		}
		
	}

}
