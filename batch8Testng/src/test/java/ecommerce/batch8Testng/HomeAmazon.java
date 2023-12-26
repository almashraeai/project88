package ecommerce.batch8Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAmazon {
	static WebDriver driver;

@FindBy	(xpath=("(//*[contains(text(),'Best Sellers')])[1]"))WebElement  BestSellers;
@FindBy	(xpath=("(//*[contains(text(),'Amazon Basics')])[1]"))WebElement  Amazonbasics;
@FindBy	(xpath=("(//*[contains(text(),'Medical Care')])[1]"))WebElement MedicalCare ;
@FindBy	(xpath=("(//*[contains(text(),'Prime')])[1]"))WebElement Prime ;
@FindBy	(xpath=("(//*[contains(text(),'New Releases')])[1]"))WebElement  NewReleases;
	
	public 	HomeAmazon (WebDriver driver){
		HomeAmazon.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void bestSellersClick() {
		BestSellers.click();
	}
	

	public void amazonBasicsClick() {
		Amazonbasics.click();
	}
	
	
	public void  MedicalCareClick() {
		MedicalCare.click();
	}
	

	public void  PrimeClick() {
		Prime.click();
	}
	
	public void NewReleasesClick () {
		NewReleases.click();
	}
		
	
}
