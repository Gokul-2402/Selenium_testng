package TestNgClases;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Dataprovider_Demo {
  @Test(dataProvider = "dp")
  public void login_OrangeHRM(String Uname, String Pass) {
	  WebDriver Driver = new ChromeDriver();
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
	  Driver.manage().window().maximize();
	  WebElement username = Driver.findElement(By.xpath("//input[@placeholder='Username']"));
	  username.sendKeys(Uname);
	  WebElement password = Driver.findElement(By.xpath("//input[@placeholder='Password']"));
	  password.sendKeys(Pass);
	  WebElement submit = Driver.findElement(By.xpath("//button[@type='submit']"));
	  submit.click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin4", "admin123" },
      new Object[] { "Gokul", "Gokul123" },
      new Object[] { "Admin", "admin123" },
    };
  }
}
