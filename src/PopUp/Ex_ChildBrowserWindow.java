package PopUp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_ChildBrowserWindow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on new tab
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> allid = driver.getWindowHandles();//mainpageid,childid
		ArrayList<String> al=new ArrayList<String>(allid);//mainpageid(0),childid(1)
		String childwindowid = al.get(1);
		System.out.println(childwindowid);
        
		//switch to childwindows
		driver.switchTo().window(childwindowid);
		//click on training tab of new tab
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
//	}

}}
