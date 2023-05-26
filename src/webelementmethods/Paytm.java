package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		Thread.sleep(2000);
	 	boolean result=driver.findElement(By.xpath("//img[@alt='image']")).isDisplayed();
	    if(result)
	    {
	    	System.out.println("logo is present");
	    }
	    else
	    {
	    	System.out.println("Logo is not present");
	    }
	}
	

}
