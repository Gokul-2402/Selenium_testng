package TestNgClases;

import org.testng.annotations.Test;

public class TestNG_groupDemo {
  @Test(groups = "smoke")
  public void Test1() {
	  System.out.println("Test1");
  }
  @Test(groups = "smoke")
  public void Test2() {
	  System.out.println("Test2");
  }
  @Test(groups = "smoke")
  public void Test3() {
	  System.out.println("Test3");
  }
  @Test(groups = "smoke")
  public void Test4() {
	  System.out.println("Test4");
  }
  @Test(groups = "smoke")
  public void Test5() {
	  System.out.println("Test5");
  }
  @Test(groups = "sanity")
  public void Test6() {
	  System.out.println("Test6");
  }
  @Test(groups = "sanity")
  public void Test7() {
	  System.out.println("Test7");
  }
  @Test(groups = "sanity")
  public void Test8() {
	  System.out.println("Test8");
  }
}
