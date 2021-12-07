package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSExampleNew {
 public static void main(String args[])
 {
	 System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	 WebDriver driver = new ChromeDriver(); 
	 driver.get("https://shivaconceptsolution.com/test.html");
	 WebElement ele = driver.findElement(By.cssSelector("input[value=click]"));
	 String s= ele.getCssValue("color");
	 String w = ele.getCssValue("width");
	 System.out.print("Color is "+s + "Width is "+w);
	 driver.close();
 }
}
