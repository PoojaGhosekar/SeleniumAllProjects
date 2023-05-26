package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_getRowSize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/pooja/VelocitySoftwareTesting/AUTOMATION/HTML/2.html");
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='101']//tr"));
		int size = allrows.size();
		System.out.println(size);
	}

}
