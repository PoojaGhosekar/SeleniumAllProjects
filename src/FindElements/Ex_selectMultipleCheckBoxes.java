package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_selectMultipleCheckBoxes {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\HTML\\childbrowserwindowex\\CheckBoxes.html");
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allcheckboxes.size());
		String value = allcheckboxes.get(0).getText();
		
//		for(WebElement s1:allcheckboxes)		{
//			s1.click();
//			String value=s1.getText();
//		}
//		for(int i=0;i<=allcheckboxes.size()-1;i++)
//		{
//			allcheckboxes.get(i).click();
//		}
	}

}
