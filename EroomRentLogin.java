package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EroomRentLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eroomrent.in/ownerlogin.php");
		WebElement txtemail = driver.findElement(By.name("txtEmail"));
		txtemail.sendKeys("riteshmahajan1997@gmail.com");
		WebElement txtpass = driver.findElement(By.name("txtPassword"));
		txtpass.sendKeys("ritesh@123");
		driver.findElement(By.name("btnsubmit")).click();
		driver.findElement(By.linkText("Logout")).click();

	}

}
