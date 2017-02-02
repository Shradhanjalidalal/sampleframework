package com.Generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormat;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listener implements ITestListener
{
//	String path=System.getProperty("user.dir");

	public void onTestStart(ITestResult result)
	{
	

	}

	public void onTestSuccess(ITestResult result) 
	{
	

	}

   public void onTestFailure(ITestResult result) 
   {
	// To get Failed method name
		String failMethName=result.getMethod().getMethodName();
	// To get Date 
	   Date dNow = new Date( );
	   SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy_hh:mm:ss");
       String d = "Current Date: " + ft.format(dNow);
       System.out.println(d);
       Date date = new Date();
   	   SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss");
   	   String sdate = sdf.format(date);
       File imgFile = ((TakesScreenshot)BrowserLaunch.driver).getScreenshotAs(OutputType.FILE);
   	try {
//   	System.out.println(path);
   		FileUtils.copyFile(imgFile, new File(System.getProperty("user.dir")+"\\screenshots\\"+failMethName+"_"+sdate+"_test.png"));
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

