package TestNgClases;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProvider_task {
  @Test(dataProvider = "dp")
  public void TestTrackTask(String Uname, String Pass) {
	  WebDriver Driver = new ChromeDriver();
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Driver.get("https://testtrack.org/login-demo ");
	  Driver.manage().window().maximize();
	  WebElement username = Driver.findElement(By.id("username"));
	  username.sendKeys(Uname);
	  WebElement password = Driver.findElement(By.id("password"));
	  password.sendKeys(Pass);
	  WebElement submit =  Driver.findElement(By.id("login-submit"));
	  submit.click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "testuser1", "testuser" },
      new Object[] { "testuser", "password123"},
    };
  }
}
