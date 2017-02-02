package com.Script;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Generic.BrowserLaunch;
import com.PO.FlipkartPO;

public class Flipkart_search extends BrowserLaunch
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
      System.out.println("-----------------------------------------"); 
	  System.out.println(rows.get(0).getText());
	  rows.get(0).click();
	  Thread.sleep(6000);
	  p.getEleSaree().sendKeys(Keys.ENTER);;
	  List<WebElement> allopt = driver.findElements(By.xpath("//div[@class='_1kJJoT']"));
	  System.out.println(allopt.size());
	 for(int j=1;j<5;j++)
	 {
		 if(j==1)
		 {
			 System.out.println(allopt.get(1).isDisplayed());
		 }
		System.out.println(allopt.get(j).isDisplayed());
	 }
		}

     
}
