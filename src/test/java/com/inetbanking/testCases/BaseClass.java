package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {

	public String baseURL="https://desktop.any.do/";
	public String username="Emosakib@gmail.com";
	public String password="2017160103";
	public String notetask="My Friday Task ";
	public String notetask2= "Hangout with Friends ";
	
	
	public WebDriver driver;
	
	public static Logger logger;


	/*@BeforeClass
	public void setUp()
	{	
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		logger=Logger.getLogger("Any_Do_Web");
		PropertyConfigurator.configure("log4j.properties");
		
	}*/
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{	
		logger=Logger.getLogger("Any_Do_Web");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome"))
		{
			String projectPath=System.getProperty("user.dir");
			System.out.println(projectPath);
			System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		
		}
		else if(br.equals("firefox"))
		{
			String projectPath=System.getProperty("user.dir");
			System.out.println(projectPath);
			System.setProperty("webdriver.gecko.driver",projectPath+"\\Drivers\\chromedriver.exe");
			driver=new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			String projectPath=System.getProperty("user.dir");
			System.out.println(projectPath);
			System.setProperty("webdriver.ie.driver",projectPath+"\\Drivers\\chromedriver.exe");
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
	}

	@AfterClass
	public void tearDown()
	{
      driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
}
