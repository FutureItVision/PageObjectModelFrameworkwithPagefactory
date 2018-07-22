package com.FutureItVisionFramework.Action;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
	
	public void HomepageCatalog(WebDriver driver,String catagory,String dresses) throws InterruptedException{
		
		Actions builder=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a[contains(text(),'"+catagory+"')]"));
		builder.moveToElement(element).build().perform();
		Thread.sleep(4000);
		WebElement element2=driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/ul//a[contains(text(),'"+dresses+"')]"));
		Assert.assertTrue(true,element2.getText());
		element2.click();
		Thread.sleep(4000);
		System.out.println(element2);
		
	}
	
	}
		
		
