package TestNgClases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  @Test
  public void f() {
  WebDriver Driver = new ChromeDriver();
  Driver.get("https://www.google.com/ " );
  SoftAssert sa = new SoftAssert();
  String Exptitle =Driver.getTitle();
  String ActTitle = "google";
  sa.assertEquals(Exptitle, ActTitle);
  System.out.println("Test Complete");
  sa.assertAll();
  }
}
