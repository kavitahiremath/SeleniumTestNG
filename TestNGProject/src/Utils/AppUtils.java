package Utils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class AppUtils {
	  public String baseUrl = "http://www.google.com";
	    String driverPath = "chromedriver.exe";
	    public WebDriver driver ; 
	    public String expected = null;
	    public String actual = null;
	    
  @BeforeMethod
  public void verifyMethod() {
	   
	      String expectedTitle = "Google";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      
  }
  @BeforeTest
  public void lauchApp() {
	  System.out.println("launching chrome browser"); 
	  System.out.println("Welcome chrome browser"); 
	  System.out.println("This is my Project");
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
  }
  @Test(priority = 0)
  public void register(){
      driver.findElement(By.linkText("Gmail")).click() ;
      expected = "Gmail: Free, Private & Secure Email | Google Workspace";
      actual = driver.getTitle();
      Assert.assertEquals(actual, expected);
      System.out.println(actual);
  }
  
  @Test(priority = 1)
  public void support() {
        driver.findElement(By.linkText("Terms")).click() ;
        expected = "Google Terms of Service – Privacy & Terms – Google";
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
  }
  @AfterMethod
  public void goBackToHomepage ( ) {
       // driver.findElement(By.linkText("Home")).click() ;
	  driver.navigate().back();
  }

  @AfterTest
  public void closeApp() {
	  System.out.println("closing chrome browser"); 
	  driver.close();
  }

}
