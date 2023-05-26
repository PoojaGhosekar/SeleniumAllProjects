package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_getColSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		int colsize = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
		System.out.println(colsize);
	}

}
////table[@id='101']//tr[3]//td[2]