package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_selectMultipleCheckBoxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\HTML\\childbrowserwindowex\\CheckBoxes.html");
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allcheckboxes.size());
		
//		for(WebElement s1:allcheckboxes)		{
//			s1.click();
//			String value=s1.getAttribute("value");
//			System.out.println(value);
//		}
//		
		for(int i=0;i<=allcheckboxes.size()-5;i++)
		{
			allcheckboxes.get(i).click();
			allcheckboxes.get(i).getAttribute("value");
			Thread.sleep(2000);
			
		}
		List<WebElement> inputvalues=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement allinput:inputvalues)
		{
			allinput.sendKeys("pooja");
		}
		Thread.sleep(2000);
		driver.close();
}

}
