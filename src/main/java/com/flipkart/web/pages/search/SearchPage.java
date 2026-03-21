package com.flipkart.web.pages.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.student.web.pages.BasePage;

public class SearchPage extends BasePage{
	
	@FindBy(xpath = "//div[contains(@class,\"mat-select-panel-wrap\")]")
	WebElement drpList;
	
	@FindBy(xpath = "//button[text () = 'Accept All']")
	WebElement btnAcceptAll;
	
	@FindBy(xpath = "//input[@aria-label='inputfield']")
	WebElement txtFromInputField;
	
	@FindBy(xpath = "(//input[@aria-label='inputfield'])[last()]")
	WebElement txtToInputField;
	
	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	public void selectRoute(String strRoute) {
		Select sltRoute = new Select(drpList);
		 sltRoute.selectByVisibleText(strRoute);
	}
	
	public void clickOnDropdown() throws InterruptedException{
		explicitWait(drpList);
		drpList.click();
	}
	
	public void clickOnFromInputTextField() throws InterruptedException{
		explicitWait(txtFromInputField);
		txtFromInputField.click();
	}
	
	public void clickOnAcceptAllButton() throws InterruptedException{
		explicitWait(btnAcceptAll);
		btnAcceptAll.click();
	}
	
	public void clickOnToInputTextField() throws InterruptedException{
		explicitWait(txtToInputField);
		txtToInputField.click();
	}
	
}
