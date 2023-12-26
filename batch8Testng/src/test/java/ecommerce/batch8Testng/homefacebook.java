package ecommerce.batch8Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class homefacebook {

	public static WebDriver driver;

	@FindBy	(xpath=("//*[contains(text(),'Connect with')][1]")) WebElement facebookActualText;
	@FindBy	(xpath=("//*[@name='email']")) WebElement facebookEmailField;
	@FindBy	(xpath=("//*[@name='pass']")) WebElement facebookpassField;
	
		public homefacebook(WebDriver driver){
			homefacebook.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		  
		public void enterEmail(String email) {
			facebookEmailField.sendKeys(email);	
		}
		
		
		public void enterPass(String pass) {
			facebookpassField.sendKeys(pass);	
		}
		
		public void getfacebookActualTextComparison1 () {
				String stringfacebookActualText =  facebookActualText.getText();
				//Assert.assertEquals(stringfacebookActualText, "Connect with friends and the world around you on Facebook.");	
        SoftAssert sf= new SoftAssert();
        sf.assertNotEquals(stringfacebookActualText, "Connect with friends and the world around you on Facebook.");
		System.out.println("this is after faild assertion");
		sf.assertAll();
		}

	
}
