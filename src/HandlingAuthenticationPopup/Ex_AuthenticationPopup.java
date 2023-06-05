package HandlingAuthenticationPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_AuthenticationPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		String username="admin";
		String password="admin";
		String url="http://"+username +":"+password +"@"+"the-internet.herokuapp.com/basic_auth";
		driver.get(url);
	}

}
