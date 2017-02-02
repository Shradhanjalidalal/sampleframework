package com.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VoonikSareesPO 
{
   WebDriver driver=null;
   public VoonikSareesPO(WebDriver driver)
   {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
   }
   @FindBy(xpath="//a[@id='menu_item_0']")
   private WebElement eleMenu;
   public WebElement getEleMenu()
   {
	   return eleMenu;
   }
   @FindBy(xpath="//a[text()='Kurta/Kurtis']/../following-sibling::li[1]/a[text()='Sarees']")
   private WebElement eleSaree;
   public WebElement getEleSaree()
   {
	   return eleSaree;
   }
   @FindBy(xpath="(//p[contains(text(),'Esk Fashions')])[1]")
   private WebElement eleIndianWear;
   public WebElement getEleIndianWear()
   {
	   return eleIndianWear;
   }
   /*@FindBy(xpath="(//p[contains(text(),'Indian Beauty')])[2]/../../../div[3]/div/table/tbody/tr/td/table/tbody/tr[3]/td/div/ul/label[contains(text(),'Free Size')]")
   private WebElement eleFreeSize;
   public WebElement getEleFreeSize()
   {
	   return eleFreeSize;
   }
   @FindBy(xpath="(//p[contains(text(),'Indian Beauty')])[2]/../../../div[3]/div/table/tbody/tr/td/table/tbody/tr[4]/td/span/a[contains(text(),'ADD TO BAG')]")
   private WebElement eleAddToBag;
   public WebElement getEleAddToBag()
   {
	   return eleAddToBag;
   }*/
   @FindBy(xpath="//div[@data-aoid='23718374']/../div[1]/a")
   private WebElement eleSilkSaree;
   public WebElement getEleSilkSaree()
   {
	   return eleSilkSaree;
   }
   
   
   
   
}

