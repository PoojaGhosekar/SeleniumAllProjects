package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_SwitchToFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		//then click to that element
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}
