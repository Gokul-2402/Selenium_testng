package TestNgClases;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class DataFromPropertyFile {
  @Test
  public void f() throws IOException {
	  
	  FileReader fr = new FileReader("C:\\Users\\gokulakrishnan.v\\Documents\\Changepond\\Selenium\\TestNGSelenium\\src\\TestNgClases\\config.properties");
	  Properties p = new Properties();
	  p.load(fr);
	  WebDriver Driver = new ChromeDriver();
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Driver.get(p.getProperty("url1"));
	  
	  WebElement Username = Driver.findElement(By.id("empid-label"));
	  Username.click();
	  Username.sendKeys(p.getProperty("username"));
	  WebElement password = Driver.findElement(By.id("outlined-adornment-password"));
	  password.sendKeys(p.getProperty("password"));
	  WebElement submit = Driver.findElement(By.xpath("//button[@type='submit']"));
	  submit.click();
	  
  }
}
