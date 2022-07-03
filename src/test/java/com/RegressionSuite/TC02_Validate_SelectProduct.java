package com.RegressionSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.Home_Page;
import com.SauceDemo.POM_BaseClass.BaseClass;


public class TC02_Validate_SelectProduct extends BaseClass{
	Home_Page hm;
	
	
	
@Test
public void SelectProductValidation() throws InterruptedException {
	  Thread.sleep(1000);
	  hm =new Home_Page (driver);
	 String actualTitle = hm.firstItem();
	  System.out.println(actualTitle);
	  
	  Thread.sleep(1000);
	  
	  Assert.assertEquals("Sauce Labs Backpack", actualTitle );
  }
}
