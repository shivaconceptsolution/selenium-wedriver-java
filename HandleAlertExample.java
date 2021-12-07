package scs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://shivaconceptsolution.com/test3.html");
		driver.findElement(By.cssSelector("input[value=alert]")).click();
		String s = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("Result is "+s);
		driver.findElement(By.cssSelector("input[value=confirm]")).click();
		String s1 = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("Result is "+s1);
		driver.findElement(By.cssSelector("input[value=prompt]")).click();
        driver.switchTo().alert().sendKeys("hi how are you");
		String s2= driver.switchTo().alert().getText();
		WebDriverWait wait = new WebDriverWait(driver,30);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		//Type your message
		alert.sendKeys("Selenium");
		
		//System.out.println(s3);
		//Press the OK button
		alert.accept();
		
	//	String s3 = driver.switchTo().alert().getText();
		//System.out.println(s3);
		
		

	}

}
