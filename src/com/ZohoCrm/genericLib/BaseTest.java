package com.ZohoCrm.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ZohoCrm.pom.EnterTimeTrackPage;
import com.ZohoCrm.pom.LoginPage;

public abstract class BaseTest implements AutoConsts{

	public static WebDriver driver;
	FileLib flib=new FileLib();
	
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		
		
		
		String browserValue = flib.getKeyPropertyValue(PROP_PATH, "browser");
		if(browserValue.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		String url = flib.getKeyPropertyValue(PROP_PATH, "url");
		driver.get(url);
	}
	
	@BeforeMethod
	public void loginToApp() throws Throwable
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(flib.getKeyPropertyValue(PROP_PATH, "username"));
		lp.setPassword(flib.getKeyPropertyValue(PROP_PATH, "password"));
		lp.clickLoginBtn();
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
		ettp.clickLogoutLink();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	
	
}
