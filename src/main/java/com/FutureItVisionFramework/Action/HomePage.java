package com.FutureItVisionFramework.Action;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FutureItVisionFramework.searchtest.HomePageSearchTest;

public class HomePage {
	
	public static final Logger log=Logger.getLogger(HomePage.class.getName());
	
	@FindBy(id="search_query_top") WebElement searchButton;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean homePageSearchButton(){
		
		try{
		
		searchButton.isDisplayed();	
		log.info("Search button displayed "+searchButton.toString());
		return true;
		}
		catch(Exception e){
			
			
			log.info("Search button was not displayed ");
		return false;
		}
		
	}
			
		}
		
		
