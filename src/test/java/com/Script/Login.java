package com.Script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Generic.BrowserLaunch;
import com.Generic.DataReading;
import com.PO.LoginPO;
@Listeners(com.Generic.Listener.class)
public class Login extends BrowserLaunch
{
 @Test
  public void testlogin() throws Throwable
  { 
	 loadurl();
	 LoginPO l=new LoginPO(driver);
	 String un = DataReading.getconfigvaule("D:\\Ibrahim\\Project\\framework\\config.properties","USERNAME");
	 l.setUsername(un);
	 l.clickNext();
	 String pw = DataReading.getconfigvaule("D:\\Ibrahim\\Project\\framework\\config.properties","PASSWORD");
	 Thread.sleep(2000);
	 l.setpassword(pw);
	 l.clickLogin();
//	 l.clickProfil();
	 Thread.sleep(2000);
	 l.clicklogout();
	 
  } 
}
