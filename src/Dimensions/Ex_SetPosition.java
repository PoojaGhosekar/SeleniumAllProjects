package Dimensions;

import java.awt.geom.Point2D;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class Ex_SetPosition {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension d=new Dimension(200, 300);
		driver.manage().window().setSize(d);
//		Point2D p=new Point2D(200,300);
//		driver.manage().window().setPosition(p);
		

}
}