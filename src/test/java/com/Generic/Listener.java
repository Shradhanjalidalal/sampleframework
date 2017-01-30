package com.Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listener implements ITestListener
{
	WebDriver driver;

	public void onTestStart(ITestResult result)
	{
	

	}

	public void onTestSuccess(ITestResult result) 
	{
	

	}

   public void onTestFailure(ITestResult result) 
   {
	   EventFiringWebDriver wd=new EventFiringWebDriver(driver);
	   File srcimg=wd.getScreenshotAs(OutputType.FILE);
	   File dstFile=new File("C:\\liqvidautomation\\framework\\screenshots.png");
	 try 
	 {
	  FileUtils.copyFile(srcimg, dstFile);
	 } 
	 catch (IOException e)
	 {
	  e.printStackTrace();
	 }
    }
   public void onTestSkipped(ITestResult result) 
   {
   }
   public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
   {
   }
   public void onStart(ITestContext context) 
   {
   }
   public void onFinish(ITestContext context)
   {
   }
}

