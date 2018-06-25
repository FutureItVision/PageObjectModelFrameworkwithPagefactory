package com.FutureItVisionFramework.searchtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.FutureItVisionFramework.Action.HomePage;
import com.FutureItVisionFramework.testbase.ScriptBase;

public class HomePageSearchTest  extends ScriptBase{
	HomePage homepage;
	@BeforeTest
	public void init(){
		beforetest();
		
	}
	
	@Test
	public void verifysearchButton(){
		
		homepage=new HomePage(driver);	
		homepage.homePageSearchButton();
		Assert.assertTrue(homepage.homePageSearchButton());
		
		
	}
	
	
	@AfterTest
	public void endSession(){
		driver.close();
	}
	

}
