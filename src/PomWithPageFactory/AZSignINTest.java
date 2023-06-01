package PomWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AZSignINTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		AzSignInPage signIn=new AzSignInPage(driver);
		signIn.clickOnSignIn();
		AZCreateAccPage createacc=new AZCreateAccPage(driver);
		createacc.createAcc();
		AZRegistrationPage register=new AZRegistrationPage(driver);
		register.registerAccount();
	}

}
