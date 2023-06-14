package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_NestedIFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		//iframeResult
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		
		String text1=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width')]")).getText();
		System.out.println(text1);
		Thread.sleep(2000);
		 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));
		String text2 = driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")).getText();
		System.out.println(text2);
		driver.switchTo().parentFrame();
		String text3 = driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width')]")).getText();
		System.out.println(text3);
	}

}
