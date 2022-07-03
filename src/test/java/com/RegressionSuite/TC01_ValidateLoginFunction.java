package com.RegressionSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POM_BaseClass.BaseClass;

public class TC01_ValidateLoginFunction extends BaseClass {
  @Test
  public void loginValidation() throws InterruptedException {
	  
	  Thread.sleep(1000);
	  Assert.assertEquals("Swag Labs",driver.getTitle());
  }
}
