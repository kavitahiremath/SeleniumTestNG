package Utils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AppUtils {
  @Test
  public void f() {
	  System.out.println("This is test"); 
	  System.out.println("This is test 1"); 
	  System.out.println("This is test 2"); 
	  System.out.println("This is test"); 
	  System.out.println("This is test 1"); 
	  System.out.println("This is test 2"); 
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before test"); 
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is After test"); 
  }

}
