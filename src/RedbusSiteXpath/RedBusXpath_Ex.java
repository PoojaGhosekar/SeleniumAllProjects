package RedbusSiteXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusXpath_Ex {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		//from
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("pune");
		//to
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("amravati");
		//date
		driver.findElement(By.xpath("(//input[@class='db'])[3]")).sendKeys("03-May-2023");
		//click on search
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
	}

}
