package com.Script;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Generic.BrowserLaunch;
import com.Generic.DataReading;
import com.PO.VoonikLoginPO;


public class VoonikLogin extends BrowserLaunch
{
	
  @Test
  public void testlogin() throws Throwable
  {
	  loadurl();
	  VoonikLoginPO l=new VoonikLoginPO(driver);
	  l.getEleLoginLink().click();
	  Thread.sleep(6000);
	  String un = DataReading.getconfigvaule(System.getProperty("user.dir")+"\\config.properties","USERNAME");
	  l.getEleUserName().sendKeys(un);
	  String pw = DataReading.getconfigvaule(System.getProperty("user.dir")+"\\config.properties","PASSWORD");
	  l.getElePassword().sendKeys(pw);
	  l.getEleSignin().click();
	  Thread.sleep(2000);
	  l.getEleImg().click();
	  Thread.sleep(8000);
	  ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  l.getElecheckBox().click();
	  Thread.sleep(8000);
	  Actions act=new Actions(driver);
	  act.moveToElement(l.getEleIndianWear()).perform();
	  Thread.sleep(3000);
	  l.getElefreesize().click();
	  l.getEleAddToBag().click();
	  Thread.sleep(3000);
	  l.getElecart().click();
	  Thread.sleep(3000);
	  l.getEledelete().click();
	  Thread.sleep(3000);
  }
}
