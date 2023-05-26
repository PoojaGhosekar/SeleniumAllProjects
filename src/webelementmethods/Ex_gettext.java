package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_gettext {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement account=driver.findElement(By.xpath("//a[text()='Create new account']"));
		String s1 = account.getText();
        Thread.sleep(2000);
        System.out.println(account.getText());
	}
	

}
