package scs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helloworld {
public static void main(String args[])
{
	 System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://eroomrent.in");
	 String title = driver.getTitle();
	 
	 if(title!="")
	 {
		 System.out.print("Title is set");
		 System.out.print(title);
	 }
	 else
	 {
		 System.out.print("Title is not set");
	 }
	 System.out.println(driver.getCurrentUrl());
	 
}
}
