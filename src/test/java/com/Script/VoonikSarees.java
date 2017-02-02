package com.Script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Generic.BrowserLaunch;
import com.PO.VoonikSareesPO;

public class VoonikSarees extends BrowserLaunch
{
	public VoonikSareesPO v;
	public Actions action;
	
  @Test
  public void verify() throws Throwable
  {
	loadurl();
	v=new VoonikSareesPO(driver);
	action=new Actions(driver);
	Thread.sleep(8000);
	action.moveToElement(v.getEleMenu()).perform();
	Thread.sleep(8000);	
	v.getEleSaree().sendKeys(Keys.ENTER);
	JavascriptExecutor j=(JavascriptExecutor) driver;
	j.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(8000);
	/*while(true)
	{
		if(v.getEleIndianWear().isDisplayed()==true)
		{
			action.moveToElement(v.getEleIndianWear()).perform();
		
		Thread.sleep(10000);
		System.out.println(driver.getCurrentUrl());
//		v.getEleFreeSize().click();
//		v.getEleAddToBag().click();
		Thread.sleep(10000);
		break;
		}
	}*/
	v.getEleSilkSaree().click();
	driver.close();
	
			
			
  }	
		
}
