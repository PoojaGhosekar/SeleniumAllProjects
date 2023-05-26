package PopUp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserWindowExusingHtmlLink {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\HTML\\childbrowserwindowex\\MainPageLink.html");
	    //click on first link
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='101']")).click();
		Thread.sleep(2000);
		
		
		//get all ids
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allid);
		//switch to child browser
		driver.switchTo().window(al.get(1));
		//click on that page link
		driver.findElement(By.xpath("//a[@id='102']")).click();
		Thread.sleep(2000);
		
		
		//get all ids of child to child browser without switching to main browser
		Set<String> allid1 = driver.getWindowHandles();
	    ArrayList<String> al1=new ArrayList<String>(allid1);
	    //switch to next child browser
	    driver.switchTo().window(al1.get(2));
	    //System.out.println(al1.get(2));
	    //click on that page link		
		driver.findElement(By.xpath("//a[@id='103']")).click();
		Thread.sleep(2000);
		
		
		
		//get all ids
		Set<String> allid2 = driver.getWindowHandles();
	    ArrayList<String> al2=new ArrayList<String>(allid2);
		//switch to next child window
		driver.switchTo().window(al2.get(3));
		//System.out.println(al2.get(3));
		driver.findElement(By.xpath("//a[@id='104']")).click();
	}

}
