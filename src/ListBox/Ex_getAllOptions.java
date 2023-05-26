package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_getAllOptions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\HTML\\ListBox.html");
		WebElement selectCountry=driver.findElement(By.xpath("//select[@id='101']"));
		
		Select s=new Select(selectCountry);
	  List<WebElement> options = s.getOptions();
	  System.out.println(options.size());
	  for(WebElement o:options)
	  {
		System.out.println(o.getText());  
	  }
	}

}
