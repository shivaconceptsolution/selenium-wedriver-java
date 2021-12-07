package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		 ChromeDriver ch = new ChromeDriver();
		 WebDriver driver=ch;
		 driver.get("https://shivaconceptsolution.com/test.html");
		 WebElement dateElement= driver.findElement(By.cssSelector("input[type=date]"));
		 dateElement.sendKeys("10-10-2010");
		 driver.findElement(By.linkText("Click")).click();
		 driver.navigate().back();
		 driver.findElement(By.partialLinkText("shivaconcept")).click();
		 driver.navigate().back();
		 WebElement txtele=driver.findElement(By.cssSelector("input[value=click]"));
		 String txtdata = txtele.getAttribute("value");
		 System.out.print(txtdata);
		 for(int i=0;i<2;i++)
		 {
			WebElement ele= driver.findElement(By.name("chk2"));
			ele.click();
			System.out.println(ele.isSelected());
			 
		 }
		 
		 Select sel = new Select(driver.findElement(By.id("c")));
		 sel.selectByIndex(2);
		 Select lst = new Select(driver.findElement(By.name("c[]")));
		 lst.selectByIndex(1);
		 lst.selectByIndex(2);
		 

	}

}
