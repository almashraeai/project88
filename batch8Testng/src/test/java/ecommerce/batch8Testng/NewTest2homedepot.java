package ecommerce.batch8Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest2homedepot {
	public static WebDriver driver;
  
@BeforeMethod
  public void beforeTest() throws InterruptedException {
	  System.out.println("this is before test");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasim\\eclipse-workspace\\selenium\\src\\Driver\\chromedriver.exe");
	 	driver=new ChromeDriver();
	 	
	 	driver.get("https://www.homedepot.com/");
	 	driver.manage().window().maximize();
	 	Thread.sleep(1000);
  }
  
  @Test
  public void test1() throws InterruptedException {
 System.out.println("this is test1");
 WebElement Gift_Cards=  driver.findElement(By.xpath("//*[contains(text(),'Gift Cards')][1]"));
 Gift_Cards.click();
 Thread.sleep(1000);
  
  }
  
  @Test
  public void test2() {
 System.out.println("this is test2");
 WebElement Credit_Services=  driver.findElement(By.xpath("//*[contains(text(),'Credit Services')][1]"));
 Credit_Services.click() ;
  }
  
  @Test
  public void test3() {
 System.out.println("this is test3");
 WebElement My_Account=  driver.findElement(By.xpath("//*[contains(text(),'My Account')][1]"));
 My_Account.click();
  } 
  
  @Test
  public void test4() {
 System.out.println("this is test4");
 WebElement email =  driver.findElement(By.xpath("//*[contains(id),'email')][1]"));
 email.sendKeys("naseem");
  } 
  
  
  @AfterMethod
  public void afterTest() throws InterruptedException {
 System.out.println("this is test"); 
 Thread.sleep(1000);
 driver.close();
  
  }

}
