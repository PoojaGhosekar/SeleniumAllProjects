package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Relativexpathwithoutusingindex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://igsindia.net/");
		
		driver.findElement(By.xpath("//a[text()='Accept All']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='et_pb_column et_pb_column_1_2 et_pb_column_26  et_pb_css_mix_blend_mode_passthrough']//div//p//a")).click();
		
	}

}
