package PomWithPageFactoryUsingChilBrowserWindow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		CHHomePage hmp=new CHHomePage(driver);
		hmp.CHclickOnNewTab();
		Thread.sleep(2000);
		CHNewTabPage nt=new CHNewTabPage(driver);
		nt.switchToChild();
		Thread.sleep(2000);
		nt.ChClickOnTraining();
		Thread.sleep(2000);
		hmp.switchToMain();
		Thread.sleep(2000);
		hmp.CHclickOnNewWindow();
		
	}

}
