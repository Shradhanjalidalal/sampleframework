package com.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPO
{
  WebDriver driver=null;
  public GmailLoginPO(WebDriver driver)
  {
    this.driver=driver;
    PageFactory.initElements(driver,this);
  }
  @FindBy(id="Email")
  private WebElement eleusername;
  public WebElement getEleusername()
  {
	return  eleusername;
  }
  @FindBy(id="next")
  private WebElement elenextButton;
  public WebElement getElenextbutton()
  {
		return  elenextButton;
  }
  @FindBy(id="Passwd")
  private WebElement elepassword;
  public WebElement getElepassword()
  {
		return  elepassword;
  }
  @FindBy(id="signIn")
  private WebElement elesignButton;
  public WebElement getElesignin()
  {
		return  elesignButton;
  }
 @FindBy(xpath="//div[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")
  private WebElement elepro;
  public WebElement getEleprofil()
  {
		return  elepro;
  }
  @FindBy(xpath="//div[@class='gb_mb gb_ha gb_g']/div[3]/div[2]/a")
  private WebElement eleclicklogout;
  public WebElement getEleclicklogout()
  {
		return  eleclicklogout;
  }
 
}
