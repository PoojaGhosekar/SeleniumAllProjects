package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_IsMultiple1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		//step 1
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		//step 2
		Select s=new Select(month);
		//step 3
		boolean result=s.isMultiple();
		if(result)
		{
			System.out.println("List box is multi-selectable");
		}
		else
		{
			System.out.println("ListBox is single selectable");
		}
		
	}

}
