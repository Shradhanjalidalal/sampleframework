package com.Script;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.Generic.BrowserLaunch;
import com.PO.FlipkartPO;

public class Flipkart_cart extends BrowserLaunch
{

	  @Test
	  public void search() throws Throwable
	  {
		  loadurl();
		  FlipkartPO p=new FlipkartPO(driver);
		  p.getEleSearch().sendKeys("sarees");
	      Thread.sleep(2000);
	      List<WebElement> options=	driver.findElements(By.xpath("//ul[@data-reactid='54']"));
	      System.out.println(options.size());
	      for(WebElement list1:options){
	    	  System.out.println(list1.getText());
	      }
	      Iterator i = options.iterator(); 
	      System.out.println("-----------------------------------------"); 
	      WebElement table = driver.findElement(By.xpath("//ul[@data-reactid='54']"));
	      List<WebElement> rows = table.findElements(By.xpath("//a[@class='_2XvRSN']"));
		  System.out.println(rows.get(0).getText());
		  rows.get(0).click();
		  Thread.sleep(8000);
		  p.getEleSaree().click();
		  Thread.sleep(8000);
		  p.getElecart().click();
		  Thread.sleep(8000);
		  p.getElecart().click();
		  p.getEleRemove().click();
		  Thread.sleep(8000);
		  p.getEleContinue().click();
		  
}
}
