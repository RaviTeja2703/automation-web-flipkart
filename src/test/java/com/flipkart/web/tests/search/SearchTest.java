package com.flipkart.web.tests.search;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flipkart.web.pages.search.SearchPage;
import com.flipkart.web.tests.BaseTest;

public class SearchTest extends BaseTest{
	public SearchPage searchPage;
	
	   @BeforeClass
	   @Parameters({"siteURL"})
	   public void initAirIndiaWebsite(String siteURL) throws InterruptedException {
		   getWebSite(siteURL);
		   searchPage = new SearchPage(driver);
	   }
	   
	   @Test(priority = 1)
	   public void SearchField() throws InterruptedException{
		 //  searchPage.clickOnDropdown();
		   searchPage.clickOnAcceptAllButton();
		   searchPage.clickOnToInputTextField();
	   }
}
