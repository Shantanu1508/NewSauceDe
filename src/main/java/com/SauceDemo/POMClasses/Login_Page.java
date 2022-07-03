package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public Login_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@class='submit-button btn_action']")
	WebElement loginButton;
	
	public void loginFunction() {
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
	}
	

}
