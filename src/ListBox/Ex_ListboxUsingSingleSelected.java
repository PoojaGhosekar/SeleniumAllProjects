package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_ListboxUsingSingleSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		//step 1(list box open)
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		//step 2
		Select s=new Select(month);
		//step 3
		//s.selectByVisibleText("Sep");//String text
		//s.selectByValue("11");
		s.selectByIndex(11);//int index
		
		
	}

}
