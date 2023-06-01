package PomWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZCreateAccPage {
	@FindBy(xpath="//a[@id='createAccountSubmit']") private WebElement createAcc;

	public AZCreateAccPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void createAcc()
	{
		createAcc.click();
	}
}
