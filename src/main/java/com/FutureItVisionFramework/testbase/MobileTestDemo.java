package com.FutureItVisionFramework.testbase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileTestDemo {
	IOSDriver<IOSElement>driver;
	public static IOSDriver<IOSElement> capabilitis() throws MalformedURLException{
		DesiredCapabilities d=new DesiredCapabilities();
        d.setCapability(MobileCapabilityType.DEVICE_NAME, "iphone 6");
        d.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        d.setCapability(MobileCapabilityType.APP, "/Users//Downloads/ios-uicatalog-master");
        //IOSDriver<IOSElement>driver=new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),d);
        
        IOSDriver<IOSElement>driver=new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),d);
		return driver;
	}

}
