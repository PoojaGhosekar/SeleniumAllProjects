package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_ListBoxUsingMultipleSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\HTML\\ListBox.html");
		Thread.sleep(2000);
		
		WebElement selectCountry=driver.findElement(By.xpath("//select[@id='101']"));
		Select s=new Select(selectCountry);
		
		s.selectByIndex(2);
		s.selectByIndex(3);
	}

}
