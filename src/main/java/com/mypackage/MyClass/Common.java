package com.mypackage.MyClass;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Common {
	static AndroidDriver<WebElement> driver;
	@Test(priority=1)
	public void launchBrowser() throws IOException {
		
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "ZF6223D8QM");
		//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "A68FA8E0");
		//caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.star.customer_app");
		//caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.star.customer_app.MainActivity");
		//caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		caps.setCapability(AndroidMobileCapabilityType.BROWSER_NAME,"Chrome");
		caps.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "c:\\Balaji\\chromedriver.exe");
		
		//caps.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "D:\\Webdrivers\\chromedriver.exe");
		
		
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		TakesScreenshot ts3 = (TakesScreenshot)driver;
		File source = ts3.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/LaunchApp1.png"));
		//driver.toggleWifi();
	}
	}
