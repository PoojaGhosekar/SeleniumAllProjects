package Framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_withoutDDF {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//click on sign in btn from login page
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(2000);
		//enter mobile no
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9673408231");
		Thread.sleep(1000);
		//click on signinwithpwd
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		Thread.sleep(1000);
		//enter password
		driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys("Pooja@2003");
		Thread.sleep(1000);
		//click on sign in 
		driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
		//mouseoveron myAccount
		WebElement myAcc = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(myAcc).perform();
		//click on myProfile
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		//switch to child window profile page
		Set<String> allId = driver.getWindowHandles();
		ArrayList<String>al=new ArrayList<String>(allId);
		driver.switchTo().window(al.get(1));
		
		//check firstname
		String actText = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		String exptext="Pooja Ghosekar";
		if(actText.equals(exptext))
		{
			System.out.println("Test case Pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}
	}

}
