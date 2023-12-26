package ecommerce.batch8Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;


public class NewTest4facebook {
	public static WebDriver driver;
	
	
  @BeforeTest
  public void beforeTest() throws InterruptedException, IOException {
	System.out.println("this is befor test"); 
	
	String brow="chrome";
	if (brow.contains("firefox")) {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasim\\eclipse-workspace\\selenium\\src\\Driver\\chromedriver.exe");
	 driver=new ChromeDriver(); //Opening browser
	}
	
	else if (brow.contains("firefox")) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\nasim\\eclipse-workspace\\selenium\\src\\Driver\\geckodriver.exe");
	driver=new FirefoxDriver(); //Opening browser
	} 
	else {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\nasim\\eclipse-workspace\\selenium\\src\\Driver\\msedgedriver.exe");
	driver=new EdgeDriver(); //Opening browser
	}
	
	 	 
	 	driver.get("https://www.facebook.com/");
	 	driver.manage().window().maximize();
	 	Thread.sleep(5000);
	 	shots_CurrentDateTime();
		System.out.println("this is befor test");   
  }
  
  @Test
  public void Test1() throws InterruptedException, IOException {
	  System.out.println("this is test 1");
		 homefacebook ob= new homefacebook(driver);
		ob.enterEmail("abc.yahoo.com");
		shots_CurrentDateTime();
		Thread.sleep(5000);
		ob.enterPass("aaaa");
		shots_CurrentDateTime();
  }
  
  /*@Test
  public void Test2() throws InterruptedException {
	  System.out.println("this is test 2");
		 homefacebook ob= new homefacebook(driver);
		ob.enterEmail("cgh@yahoo.com");
		Thread.sleep(5000);
		ob.enterPass("bbbbbb");
  }
  */
  @AfterTest
  public void afterTest() throws InterruptedException {
	  System.out.println("this is after test"); 
	  Thread.sleep(1000);
	  driver.close();  
  }

  public void shots_withArgs(String filename) throws IOException {
	 File cap= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  FileHandler.copy(cap, new File("C:\\Users\\nasim\\eclipse-workspace\\batch8Testng\\screenshots\\"+ filename+".png") );
}

  public void shots_CurrentDateTime() throws IOException {
	  Date dt= new Date();
	  String filename1 = dt.toString().replace(" ", "_").replace(":", "_");
		 File cap= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(cap, new File("C:\\Users\\nasim\\eclipse-workspace\\batch8Testng\\screenshots\\"+ filename1 + ".png"));
	} 
  
  
}
