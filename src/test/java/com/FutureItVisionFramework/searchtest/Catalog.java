package com.FutureItVisionFramework.searchtest;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.FutureItVisionFramework.Action.HomePage;
import com.FutureItVisionFramework.testbase.ScriptBase;

public class Catalog extends ScriptBase{
	public static final Logger log=Logger.getLogger(Catalog.class.getName());
	HomePage homepage;
	
	@BeforeTest
	public void init(){
		beforetest();
		
	}
	
	@Test
	public void verifyCatalogDressSelectale() throws InterruptedException{
		log.info("#############verifyCatalogDressSelectale test start######");
		homepage=new HomePage(driver);	
		homepage.HomepageCatalog(driver, "Dresses", "Summer Dresses");
		log.info("#############verifyCatalogDressSelectale test Finish######");
		
		
	}
	
	
	@AfterTest
	public void endSession(){
		driver.close();
	}
	
	

}
