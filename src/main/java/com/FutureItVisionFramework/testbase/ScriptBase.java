package com.FutureItVisionFramework.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptBase {
	public WebDriver driver;
	public void beforetest(){
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		
	}
	

}
