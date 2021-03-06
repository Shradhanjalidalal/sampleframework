package com.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserLaunch 
{
	public static WebDriver driver;
	@BeforeMethod
	public static WebDriver getbrowser() throws Throwable
	{
		if(DataReading.getconfigvaule(System.getProperty("user.dir")+"\\config.properties","BROWSER").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Resources\\geckodriver.exe");
			System.out.println("Firefox Browser is set");
			driver = new FirefoxDriver();
		}
		else if(DataReading.getconfigvaule(System.getProperty("user.dir")+"\\config.properties","BROWSER").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Resources\\chromedriver.exe");
			System.out.println("chrome Browser is set");
			driver=new ChromeDriver();
		}
		
		return driver;
		
	}
	
	public void loadurl() throws Throwable
	{
		DataReading d=new DataReading();
		String url=d.getconfigvaule(System.getProperty("user.dir")+"\\config.properties", "URL");
		driver.get(url);
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	/*@AfterMethod
    public void postcondition()
	{
		driver.close();
	}*/
	
}
