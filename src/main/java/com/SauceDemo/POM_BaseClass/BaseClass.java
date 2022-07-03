package com.SauceDemo.POM_BaseClass;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.SauceDemo.POMClasses.Home_Page;
import com.SauceDemo.POMClasses.Login_Page;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BaseClass {
    public  WebDriver driver;
	Logger log;
	Login_Page lp;
	Home_Page hm;
	
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./browser_driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		log = Logger.getLogger("SauceDemo20June2022");
		PropertyConfigurator.configure("log4j.properties");
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		log.info("Browser is open");
		
	}
	
	@BeforeMethod()
	public void loginFunction() {
	
		lp = new Login_Page (driver);
		lp.loginFunction();
	}
	
	@AfterMethod()
	public void logout() {
		
		hm = new Home_Page(driver);
		hm.logoutFunction();
	}
	
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
	}
}
