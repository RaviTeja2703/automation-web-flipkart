package com.flipkart.web.tests.login;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.ietf.jgss.Oid;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flipkart.web.tests.BaseTest;

public class LoginTest extends BaseTest{
	
	public static Logger log = Logger.getLogger(LoginTest.class);
	
	@BeforeClass
    @Parameters({"siteURL"})
	public void initAmazonWebSite(String siteURL) throws InterruptedException{
		log.info("Starting initAmazonWebSite");
		getWebSite(siteURL);
		log.info("Ending initAmazonWebSite");
	}
	
	
	
	@Test(priority = 1)
	public void verifyLoginWithSpecialCharacters() throws InterruptedException { 
		log.info("Starting verifyLoginWithInvalidSpecialCharacters method");
		
		loginPage.setMobileNumber("@#$%%$");	
		loginPage.clickOnRequestOTP();
		
		log.info("Ending verifyLoginWithInvalidSpecialCharacters method");
	} 

	@Test(priority = 2)
	public void verifyLoginWithEmptyMobNumberField() throws InterruptedException {
		log.info("Starting verifyLoginWithEmptyMobNumberField method");
		
		loginPage.setMobileNumber("");
		loginPage.clickOnRequestOTP();
		
		log.info("Ending verifyLoginWithEmptyMobNumberField method");
	}
	
	@Test(priority = 3)
	public void verifyLoginWithValidMobileNumber() throws InterruptedException {
		log.info("Starting verifyLoginWithValidMobileNumber method");
		
		flipkartLogin();
		
		log.info("Starting verifyLoginWithValidMobileNumber method");
	}
	
	@AfterClass
	public void quitDriver(){
		driver.quit();
	}
	
		
}
