package com.flipkart.web.pages.login;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipkart.web.pages.BasePage;

public class LoginPage extends BasePage{
	
	@FindBy(xpath = "//div[@class=\"H6-NpN _3N4_BX\"]")
	WebElement btnLogin;
	
	@FindBy(xpath = "//input[contains(@class,\"r\")]")
	WebElement txtEnterEmailMobile;
	
	@FindBy(xpath = "//button[text() = 'Request OTP']")
	WebElement btnRequestOTP;
	
	@FindBy(xpath = "//span[text() = \"Please enter valid Email ID/Mobile number\"]")
	WebElement lblEnterValidMobile;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnLogin() throws InterruptedException{
		explicitWait(btnLogin);
		btnLogin.click();
	}
	
	public void setMobileNumber(String mobileNumber) throws InterruptedException{
		explicitWait(txtEnterEmailMobile);
		
		txtEnterEmailMobile.sendKeys(Keys.CONTROL + "A",Keys.DELETE);

//	    String value = txtEnterEmailMobile.getAttribute("value");
//	    if(value != null) {
//	    	int valLen = value.length();
//	    	for(int i=0; i < valLen; i++) {
//	    		txtEnterEmailMobile.sendKeys(Keys.BACK_SPACE);
//	    	}
//	    }
	    
		txtEnterEmailMobile.sendKeys(mobileNumber);
	}
	
	public void clickOnRequestOTP() throws InterruptedException{
		explicitWait(btnRequestOTP);
		btnRequestOTP.click();
	}
	
	public String getInvalidMobileError() throws InterruptedException{
		explicitWait(lblEnterValidMobile);
		return lblEnterValidMobile.getText();
	}
	
}
