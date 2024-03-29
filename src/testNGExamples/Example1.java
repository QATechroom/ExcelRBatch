package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Example1 {
  @Test(dependsOnMethods= {"testA"})
  public void testB() {
	  
	  System.out.println("This is TestB Method");
  }
  
  @Test (dependsOnMethods= {"testB"})
 public void testA() {
	  
	  System.out.println("This is TestA Method");
  }
  
 /* @Test (priority=0,dependsOnMethods= {"testB","testA"})
 public void testC() {
	  
	  System.out.println("This is TestC Method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is After Method");
  }

 @BeforeTest
  public void beforeTest() {
	  System.out.println("This is Before Test Method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is After Test Method");
  }*/

}
