package com.SauceDemo.POMUtitlityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {

	private  Date dt;
	private String title, date;
	private TakesScreenshot ts;
	private File source, destination;
	public  void screenshot(WebDriver driver) throws IOException {
		dt = new Date();
		date = new SimpleDateFormat("MM-dd-yy & HH-mm-ss").format(dt);
		title = driver.getTitle();
		
		ts = (TakesScreenshot) driver;
		source = ts.getScreenshotAs(OutputType.FILE);
		destination = new File("./screenshot/"+title+"_"+date+".jpg");
		FileHandler.copy(source, destination);
	}

}
