package ecommerce.batch8Testng;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class NewTest1baseclass extends baseclass {
	
  @Test (groups = {"regression"})
 public void Test1() throws InterruptedException, IOException {
 System.out.println("this is test 1");
 
 Properties prop= new Properties();
 FileInputStream  fin= new FileInputStream("C:\\Users\\nasim\\eclipse-workspace\\batch8Testng\\userdatails.propetie");
 prop.load(fin);
 
 String email = prop.getProperty("Email");
 String password = prop.getProperty("Password");
 
 homefacebook ob= new homefacebook(driver);
	ob.enterEmail(email);
	shots_CurrentDateTime();
	Thread.sleep(5000);
	ob.enterPass(password);
	shots_CurrentDateTime();
  }
 
  
  @Test (groups = {"regression"})
  public void Test2() throws InterruptedException, IOException {
  System.out.println("this is test 2");
  
  homefacebook ob= new homefacebook(driver);
 	ob.enterEmail("abc.yahoo.com");
 	shots_CurrentDateTime();
 	Thread.sleep(5000);
 	ob.enterPass("aaaaaaa");
 	shots_CurrentDateTime();
   }

}
