package PomWithPageFactoryAmazon;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class AMZHomePage {
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") private WebElement searchItem;
	//@FindAll(xpath="") private List<WebElement> allOptions;
}
