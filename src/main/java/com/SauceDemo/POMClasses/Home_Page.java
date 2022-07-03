package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_Page {
	
	private Select select;

	
	public Home_Page(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filter;	
	
	public void filterFunction() {
		
		select = new Select(filter);
		select.deselectByValue("lohi");
	}
	
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement item1;
	public String firstItem() {
		
		item1.click();
		
	return	item1.getText();
		
	}
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement hamBurger;
	
	@FindBy(xpath="//a [text()='Logout']")
	private WebElement logout;
	public void logoutFunction() {
		
		hamBurger.click();
		logout.click();
	}

}
