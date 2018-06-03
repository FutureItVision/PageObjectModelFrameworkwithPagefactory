package com.FutureItVisionFramework.searchtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.FutureItVisionFramework.testbase.ScriptBase;

public class HomePageSearchTest  extends ScriptBase{
	@BeforeTest
	public void init(){
		beforetest();
		
	}
	
	@Test
	public void verifysearchButton(){
		driver.findElement(By.xpath(".//*[@id='search_query_top']")).sendKeys("Test");
		System.out.println(driver.findElement(By.xpath(".//*[@id='search_query_top']")).getSize());
		
		
	}

}
