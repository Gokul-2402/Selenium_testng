package TestNgClases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class parameterize_task {
	WebDriver Driver;
	@Parameters({"Fname","Lname","addr","mail","phn","skills"})
  @Test
  public void f(String Fname,String Lname, String addr,String mail ,String phn , String skills) {
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement firstname = Driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	    firstname.sendKeys(Fname);
		
		WebElement Lastname = Driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		Lastname.sendKeys(Lname);
		
		WebElement address= Driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys(addr);
		
		WebElement Email = Driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		Email.sendKeys(mail);
		
		WebElement Phone = Driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		Phone.sendKeys(phn);
		
		Select s= new Select (Driver.findElement(By.id("Skills")));
		s.selectByVisibleText(skills);
		
		
}
  @BeforeTest
  public void beforeTest() {
	   Driver = new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Register.html");
		Driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  Driver.close();
  }

}
