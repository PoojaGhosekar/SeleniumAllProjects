package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserpopupInAmazon {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=philips+vacuum+cleaner&crid=1AEBISZ37AY1U&sprefix=%2Caps%2C72&ref=nb_sb_ss_recent_1_0_recent");
		//click on product link
		driver.findElement(By.xpath("(//span[contains(text(),'Philips PowerPro FC9352/01-Compact Bagless')])[1]")).click();
		//get all ids
		 Set<String> allid = driver.getWindowHandles();
		 ArrayList<String> al=new ArrayList<String>(allid);
		 
		//switch to child window
		driver.switchTo().window(al.get(1));
		//click on product link title
		driver.findElement(By.xpath("//span[@id='productTitle']")).click();
		
		
		
		//switch to main page
		driver.switchTo().window(al.get(0));
		//click on select your address
		driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']")).click();
	}

}
