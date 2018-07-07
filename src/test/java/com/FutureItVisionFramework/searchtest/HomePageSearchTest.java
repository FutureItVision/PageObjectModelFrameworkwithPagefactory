package com.FutureItVisionFramework.searchtest;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.FutureItVisionFramework.Action.HomePage;
import com.FutureItVisionFramework.testbase.ScriptBase;

public class HomePageSearchTest  extends ScriptBase{
	public static final Logger log=Logger.getLogger(HomePageSearchTest.class.getName());

	HomePage homepage;
	@BeforeTest
	public void init(){
		beforetest();
		
	}
	
	@Test
	public void verifysearchButton(){
		log.info("#############Saerch button test start######");
		homepage=new HomePage(driver);	
		homepage.homePageSearchButton();
		Assert.assertTrue(homepage.homePageSearchButton());
		log.info("#############Saerch button test Finish######");
		
		
	}
	
	
	@AfterTest
	public void endSession(){
		driver.close();
	}
	

}
