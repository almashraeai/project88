package ecommerce.batch8Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest3A {
	
	public static WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.out.println("this is before test");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasim\\eclipse-workspace\\selenium\\src\\Driver\\chromedriver.exe");
	 	driver=new ChromeDriver();
	 	
	 	driver.get("https://www.amazon.com/");
	 	driver.manage().window().maximize();
	 	Thread.sleep(1000);
	 	System.out.println("this is befor test");
  }
  
  @Test
  public void Test1() throws InterruptedException {
	 System.out.println("this is test 1");
	 HomeAmazon ob= new HomeAmazon(driver);
	 ob.bestSellersClick();
	  Thread.sleep(1000);
  }
  
  @Test
  public void Test2() throws InterruptedException {
	 System.out.println("this is test 2");
	 HomeAmazon ob= new HomeAmazon(driver);
	ob.amazonBasicsClick();
	  Thread.sleep(1000);
  }
  
  @Test
  public void Test3() throws InterruptedException {
	 System.out.println("this is test 3");
	 HomeAmazon ob= new HomeAmazon(driver);
	ob.MedicalCareClick();
	  Thread.sleep(1000);
  }
  
  @Test
  public void Test4() throws InterruptedException {
	 System.out.println("this is test 4");
	 HomeAmazon ob= new HomeAmazon(driver);
	ob.PrimeClick();
	  Thread.sleep(1000);
  }
  
  @Test
  public void Test5() throws InterruptedException {
	 System.out.println("this is test 5");
	 HomeAmazon ob= new HomeAmazon(driver);
     ob.NewReleasesClick();
	  Thread.sleep(1000);
  }
  
  @AfterMethod
	  public void afterTest() throws InterruptedException {
		  System.out.println("this is after test"); 
		  Thread.sleep(1000);
		  driver.close();
  }

}
