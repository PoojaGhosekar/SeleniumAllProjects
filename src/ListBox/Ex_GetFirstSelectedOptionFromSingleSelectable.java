package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_GetFirstSelectedOptionFromSingleSelectable {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			Thread.sleep(2000);
			//step 1
			WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
			
			//step 2
			Select s=new Select(month);
			//step 3
			//s.selectByIndex(8);
			//
			s.selectByIndex(10);
			WebElement options=s.getFirstSelectedOption();
			String text=options.getText();
			System.out.println(text);
			Thread.sleep(2000);
			s.selectByIndex(11);
			
			
	}

}
