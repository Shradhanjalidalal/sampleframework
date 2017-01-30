package com.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPO
{
  WebDriver driver=null;
  public LoginPO(WebDriver driver)
  {
    this.driver=driver;
    PageFactory.initElements(driver,this);
  }
  @FindBy(id="Email")
  private WebElement unTB;
  @FindBy(id="next")
  private WebElement nextButton;
  @FindBy(id="Passwd")
  private WebElement passTB;
  @FindBy(id="signIn")
  private WebElement signButton;
 // @FindBy(xpath="//div[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")
  
//  private WebElement elepro;
  @FindBy(xpath="//div[@class='gb_mb gb_ha gb_g']/div[3]/div[2]/a")
  private WebElement clicklogout;
 public void setUsername(String un) 
 {
	unTB.sendKeys(un);
 }
 public void clickNext() 
 {
	nextButton.click();
 }
 public  void setpassword(String pw) 
 {
   passTB.sendKeys(pw);	
 }
 public  void clickLogin() 
 {
  signButton.click();	
 }
/* public  void  clickProfil() 
 {
	elepro.click();
 }*/
 public void  clicklogout() 
 {
	clicklogout.click();
 }
}
