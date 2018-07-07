package com.FutureItVisionFramework.testbase;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptBase {
	public static final Logger log=Logger.getLogger(ScriptBase.class.getName());
	
	public WebDriver driver;
	public void beforetest(){
		String Log4jConfigPath="log4j.properties";
		PropertyConfigurator.configure(Log4jConfigPath);
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		
	}
	

}
