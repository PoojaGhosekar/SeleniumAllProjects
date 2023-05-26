package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_IsMultiple2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\HTML\\ListBox.html");
		Thread.sleep(2000);
		
		WebElement selectCountry=driver.findElement(By.xpath("//select[@id='101']"));
		Select s=new Select(selectCountry);
		
		boolean result=s.isMultiple();
		if(result)
		{
			System.out.println("List box is Multiselectable");
		}
		else
		{
			System.out.println("Listbox is single selectable");
		}

}
}
