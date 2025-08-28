package TestNgClases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting_demo {
  @Test(priority = 0)
  public void Edge() {
	  WebDriver Driver = new EdgeDriver();
	  Driver.get("https://testtrack.org/login-demo");
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement username = Driver.findElement(By.id("username"));
	  username.sendKeys("Gokul");
	  WebElement password = Driver.findElement(By.id("password"));
	  password.sendKeys("happy");
	  WebElement submit =  Driver.findElement(By.id("login-submit"));
	  submit.click();
  }
  @Test(priority = 1)
  public void Chrome() {
	  WebDriver Driver = new ChromeDriver();
	  Driver.get("https://testtrack.org/login-demo");
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement username = Driver.findElement(By.id("username"));
	  username.sendKeys("Gokul");
	  WebElement password = Driver.findElement(By.id("password"));
	  password.sendKeys("happy");
	  WebElement submit =  Driver.findElement(By.id("login-submit"));
	  submit.click();
  }
  @Test(priority = 2)
  public void Firefox(String Uname,String Pass) {
	  WebDriver Driver = new FirefoxDriver();
	  Driver.get("https://testtrack.org/login-demo");
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement username = Driver.findElement(By.id("username"));
	  username.sendKeys("Gokul");
	  WebElement password = Driver.findElement(By.id("password"));
	  password.sendKeys("happy");
	  WebElement submit =  Driver.findElement(By.id("login-submit"));
	  submit.click();
  }
}
