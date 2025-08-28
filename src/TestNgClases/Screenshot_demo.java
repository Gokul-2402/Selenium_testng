package TestNgClases;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Screenshot_demo {
	WebDriver Driver;
  @Test 
  public void login() throws IOException {
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement click = Driver.findElement(By.id("login2"));
	  click.click();
	  
	  WebElement username = Driver.findElement(By.id("loginusername"));
	  username.sendKeys("Gokul");
	  WebElement password = Driver.findElement(By.id("loginpassword"));
	  password.sendKeys("Gokul123");
	  WebElement login = Driver.findElement(By.xpath("//button[@onclick='logIn()']"));
	  login.click();
	  
	  
	  
	  
	  File fr=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	  Files.copy(fr,new File("C:\\Users\\gokulakrishnan.v\\Documents\\Changepond\\Selenium\\Screenshot\\screenshot.jpg") );
  }
  @BeforeTest
  public void beforeTest() {
	  Driver =  new ChromeDriver();
	  Driver.get("https://demoblaze.com/?ref=testable ");
	  Driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  Driver.close();
  }

}
