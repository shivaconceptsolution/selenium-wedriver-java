package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeExample {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://eroomrent.in");
		 WebElement element = driver.findElement(By.tagName("h1"));
		 String s = element.getText();
		 System.out.print(s);

	}

}
