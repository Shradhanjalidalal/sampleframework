package com.Script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart 
{
	@Test
	  public void verify() throws InterruptedException
	  {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement indWer=driver.findElement(By.xpath("//a/span[text()='Electronics']"));	
	    Actions action=new Actions(driver);
		Thread.sleep(20000);
		action.moveToElement(indWer).perform();
		Thread.sleep(10000);
	/*	WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 String strJavaScript = "var element = arguments[0];"
		           + "var mouseEventObj = document.createEvent('MouseEvents');"
		           + "mouseEventObj.initEvent( 'mouseover', true, true );"
		           + "element.dispatchEvent(mouseEventObj);";
		    js.executeScript(strJavaScript, element);*/
		    Thread.sleep(10000);
		    WebElement element1 = driver.findElement(By.xpath("//a[@title='Lenovo']/../preceding-sibling::li/a[@title='Samsung']"));
		    element1.click();
//	    js.executeScript("arguments[0].click();", element1);
		
		Thread.sleep(8000);
		System.out.println(driver.getCurrentUrl());	
		driver.close();
	  }
	  
}
