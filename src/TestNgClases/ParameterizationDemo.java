package TestNgClases;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ParameterizationDemo {
	WebDriver Driver ;
	@Parameters({"Un","pwd"})
  @Test
  public void f(String Un, String pwd) {
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement username = Driver.findElement(By.id("user-name"));
	  username.sendKeys(Un);
	  WebElement password = Driver.findElement(By.id("password"));
	  password.sendKeys(pwd);
	  WebElement submitbtn = Driver.findElement(By.id("login-button"));
	  submitbtn.click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  Driver = new ChromeDriver();
	  Driver.get("https://www.saucedemo.com/");
	  Driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  Driver.close();
  }

}
