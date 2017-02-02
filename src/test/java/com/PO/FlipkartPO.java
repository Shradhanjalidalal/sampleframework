package com.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPO 
{
	 WebDriver driver=null;
	   public FlipkartPO(WebDriver driver)
	   {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	   }
   @FindBy(xpath="//input[@class='LM6RPg']")
   private WebElement eleSearch;
   public WebElement getEleSearch()
   {
	   return eleSearch;
   }
  
   @FindBy(xpath="//a[@title='E-Vastram Printed Bollywood Printed Silk Sari']")
   private WebElement eleSaree;
   public WebElement getEleSaree()
   {
	   return eleSaree;
   }
   @FindBy(xpath="//button[@class='_2AkmmA _3Plo8Q _19RW-r']")
   private WebElement elecart;
   public WebElement getElecart()
   {
	   return elecart;
   }
   @FindBy(xpath="//a[@title='Remove Item']")
   private WebElement eleRemove;
   public WebElement getEleRemove()
   {
	   return eleRemove;
   }
   @FindBy(xpath="//button[contains(text(),'Continue Shopping')]")
   private WebElement eleContinue;
   public WebElement getEleContinue()
   {
	   return eleContinue;
   }
}
