package ListBox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAscendingOrderFromListBoxUsingTreeset {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/pooja/VelocitySoftwareTesting/AUTOMATION/HTML/AscendingOderTree.html");
		WebElement month = driver.findElement(By.xpath("//select[@id='101']"));
		
		Select s=new Select(month);
		
		List originallist = new ArrayList();
		
		List<WebElement> options = s.getOptions();
		for(WebElement o:options)
		{
			originallist.add(o.getText());
		}
		System.out.println("Original List "+originallist);
		List templist=new ArrayList();
		templist=originallist;
		System.out.println("Before Sorting List"+templist);
		Collections.sort(templist);
		System.out.println("After Sorting List "+templist);
		
		
		
		
	}

}
