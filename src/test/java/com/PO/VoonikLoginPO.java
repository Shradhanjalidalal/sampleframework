package com.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VoonikLoginPO 
{
	 WebDriver driver=null;
	  public VoonikLoginPO(WebDriver driver)
	  {
	    this.driver=driver;
	    PageFactory.initElements(driver,this);
	  }
  @FindBy(xpath="//div[@id='trow1_right']/div/div[2]/a")
  private WebElement eleLoginLink;
  public WebElement getEleLoginLink()
  {
	  return eleLoginLink;
  }
  @FindBy(xpath="(//div[@class='col-md-12 sclose sclose_btn'])[1]/..//input[@id='user_email']")
  private WebElement eleUserName;
  public WebElement getEleUserName()
  {
	  return eleUserName;
  }
  @FindBy(xpath="(//div[@class='col-md-12 sclose sclose_btn'])[1]/..//input[@id='user_password']")
  private WebElement elePassword;
  public WebElement getElePassword()
  {
	  return elePassword;
  }
  @FindBy(xpath="(//div[@class='col-md-12 sclose sclose_btn'])[1]/..//button[@class='btn']")
  private WebElement eleSignin;
  public WebElement getEleSignin()
  {
	  return eleSignin;
  }
  //------------------------------remove from cart------------------------------------------------------------
  @FindBy(xpath="//img[@src='//images1.voonik.com/campaigns/2feb_web1.jpg']")
  private WebElement eleImg;
  public WebElement getEleImg()
  {
	  return eleImg;
  }
  @FindBy(xpath="//label[contains(text(),'Sarees')]")
  private WebElement elecheckBox;
  public WebElement getElecheckBox()
  {
	  return elecheckBox;
  }
  @FindBy(xpath="(//p[contains(text(),'New Designer Saree')])[1]")
  private WebElement eleIndianWear;
  public WebElement getEleIndianWear()
  {
	   return eleIndianWear;
  }
  @FindBy(xpath="(//p[contains(text(),'New Designer Saree')])[1]/../../../div[3]/div/table/tbody/tr/td/table/tbody/tr[3]/td/div/ul/label[contains(text(),'Free Size')]")
  private WebElement eleFreesize;
  public WebElement getElefreesize()
  {
	  return eleFreesize;
  }
  @FindBy(xpath="(//p[contains(text(),'New Designer Saree')])[1]/../../../div[3]/div/table/tbody/tr/td/table/tbody/tr[4]/td/span/a[contains(text(),'ADD TO BAG')]")
  private WebElement eleAddToBag;
  public WebElement getEleAddToBag()
  {
	  return eleAddToBag;
  }
  @FindBy(xpath="//a[@href='/checkout/bag']")
  private WebElement elecart;
  public WebElement getElecart()
  {
	  return elecart;
  }
  @FindBy(xpath="//span[contains(text(),'DELETE')]")
  private WebElement eledelete;
  public WebElement getEledelete()
  {
	  return eledelete;
  }
}
