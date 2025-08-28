package TestNgClases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TaskTestNG {
	WebDriver Driver;
  @Test(priority = 1)
  public void Valid_login() {
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement username = Driver.findElement(By.xpath("//input[@placeholder='Username']"));
	  username.sendKeys("Admin");
	  WebElement password = Driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  WebElement submitbtn = Driver.findElement(By.xpath("//button[@type='submit']"));
	  submitbtn.click();
	  Driver.navigate().back();
//	  Driver.navigate().refresh();
	  
  }
  
  @Test(priority = 2)
  public void invalid_login() {
	 
	  
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	  WebElement username = Driver.findElement(By.xpath("//input[@placeholder='Username']"));
	  username.sendKeys("Admin");
	  WebElement password = Driver.findElement(By.name("password"));
	  password.sendKeys("ad23");
	  WebElement submitbtn = Driver.findElement(By.xpath("//button[@type='submit']"));
	  submitbtn.click();
	 
  }
  @BeforeTest
  public void beforeTest() {
	  Driver = new ChromeDriver();
	  Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
	  Driver.manage().window().maximize();
  }

  @AfterTest
  public void close() {
	  Driver.close();
  }

}
