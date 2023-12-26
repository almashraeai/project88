package ecommerce.batch8Testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest1Dp extends baseclass {
  @Test(dataProvider = "dp")
  public void f(String email, String pass) throws InterruptedException {
	  homefacebook ob= new homefacebook(driver);
	 	ob.enterEmail(email);
	 	Thread.sleep(5000);
	 	ob.enterPass(pass);
  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "aaaaa" },
      new Object[] { "def@yahoo.com", "bbbbb" },
    };
  }
}
