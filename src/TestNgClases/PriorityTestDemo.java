package TestNgClases;

import org.testng.annotations.Test;

public class PriorityTestDemo {
  @Test(priority = 'a')
  public void first() {
	
	  System.out.println("first");
  }
  @Test(priority ='b')
  public void second() {
	  System.out.println("second");
  }
  @Test(priority = 'c')
  public void third() {
	  System.out.println("third");
  }
  @Test(priority = 1)
  public void four() {
	  System.out.println("four");
  }
  @Test(priority = 6)
  public void five() {
	 
	  System.out.println("five");
  }
  @Test (enabled=false)
  public void six() {
	  
	  System.out.println("abc");
  }
}
