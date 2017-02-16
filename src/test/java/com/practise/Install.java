package com.practise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Install {

	public static void main(String[] args)  throws IOException{
		
			 WebDriver driver=new FirefoxDriver();
		        driver.get("file:///C:/Users/Administrator/Desktop/Practise/fileupload.html");
		        driver.findElement(By.xpath("//input[@id='1']")).click();
		        Runtime.getRuntime().exec("C:\\Users\\Administrator\\Desktop\\Practise\\Demo.exe");	
	}
	
	}
	

