package com.FutureItVisionFramework.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/input[67]") WebElement searchButton;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean homePageSearchButton(){
		
		try{
		
		searchButton.isDisplayed();	
		return true;
		}
		catch(Exception e){
		System.out.println("homePageSearchButton locator issue");
		return false;
		}
		
	}
			
		}
		
		
