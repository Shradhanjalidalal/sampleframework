package com.Script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Generic.BrowserLaunch;
import com.Generic.DataReading;
import com.PO.GmailLoginPO;
@Listeners(com.Generic.Listener.class)
public class GmailLogin extends BrowserLaunch
{
 @Test
  public void testlogin() throws Throwable
  { 
	 loadurl();
	 GmailLoginPO l=new GmailLoginPO(driver);
	 String un = DataReading.getconfigvaule(System.getProperty("user.dir")+"\\config.properties","USERNAME");
	 l.getEleusername().sendKeys(un);
	 l.getElenextbutton().click();
	 String pw = DataReading.getconfigvaule(System.getProperty("user.dir")+"\\config.properties","PASSWORD");
	 Thread.sleep(2000);
	 l.getElepassword().sendKeys(pw);;
	 l.getElesignin().click();;
	 l.getEleprofil().click();;
	 Thread.sleep(2000);
	 l.getEleclicklogout().click();;
	 
  } 
}
