package TEstNGMultipleBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Ex_MultipleBrowser {
	@Parameters("browserName")
	@Test
	
	public void Tc1(String browseName) {
		WebDriver driver=null;
		if(browseName.equals("chrome"))
		{
		 driver=new ChromeDriver();
		}
		else if(browseName.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get("https://www.facebook.com/");
	}

}
