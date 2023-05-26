package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_BigBasket {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/pc/beverages/tea/?nc=nb#!page=2");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    List<WebElement> allcheck = driver.findElements(By.xpath("(//section)[3]//div//span[@class='cr']"));
	    System.out.println(allcheck.size());
	    for(int i=allcheck.size()-1;i>=0;i--)
	    {
	    	allcheck.get(i).click();
	    	
	    	Thread.sleep(8000);
	    }
	    
	    
	    //		driver.findElement(By.xpath("//span[text()='18 Herbs']")).click();
//		driver.findElement(By.xpath("//span[text()='24 Mantra']")).click();
	}
//((//div[@class='col-xs-12 ng-scope'])[1]//input)[2]
}
