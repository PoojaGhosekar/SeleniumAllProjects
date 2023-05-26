package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_getData {
	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	Thread.sleep(2000);
	String text = driver.findElement(By.xpath("//table[@class='dataTable']//tr[11]//td[4]")).getText();
	System.out.println(text);
}
}