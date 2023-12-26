package ecommerce.batch8Testng;

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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class baseclass {
	public static WebDriver driver;
	
  @BeforeTest (alwaysRun = true)
  @Parameters({"selectedbrowser"})
    public void beforeTest(String selectedbrowsere) throws InterruptedException, IOException {
    System.out.println("this is befor test"); 
		
    String brow= selectedbrowsere;

     if (brow.contains("chrome")) {	
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
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

