package TestNgClases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class CrossBrowserTestingDemo {
  @Test
  @Parameters({"browser","Uname","Pass"})
  public void CrossBrowser(String browser, String Uname, String Pass) {
	  if (browser.equalsIgnoreCase("Chrome")){
		  WebDriver Driver = new ChromeDriver();
		  Driver.get("https://testtrack.org/login-demo");
		  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement username = Driver.findElement(By.id("username"));
		  username.sendKeys(Uname);
		  WebElement password = Driver.findElement(By.id("password"));
		  password.sendKeys(Pass);
		  WebElement submit =  Driver.findElement(By.id("login-submit"));
		  submit.click();

	  }else if(browser.equalsIgnoreCase("firefox")){
		  WebDriver Driver = new FirefoxDriver();
		 
		  Driver.get("https://testtrack.org/login-demo");
		  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement username = Driver.findElement(By.id("username"));
		  username.sendKeys(Uname);
		  WebElement password = Driver.findElement(By.id("password"));
		  password.sendKeys(Pass);
		  WebElement submit =  Driver.findElement(By.id("login-submit"));
		  submit.click();
		  
	  }
	  else if(browser.equalsIgnoreCase("edge")) {
		  WebDriver Driver = new EdgeDriver();
		  Driver.get("https://testtrack.org/login-demo");
		  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement username = Driver.findElement(By.id("username"));
		  username.sendKeys(Uname);
		  WebElement password = Driver.findElement(By.id("password"));
		  password.sendKeys(Pass);
		  WebElement submit =  Driver.findElement(By.id("login-submit"));
		  submit.click();
		  
	  }
	  else {
		  System.out.println("browder not found");
	  }
	 
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
