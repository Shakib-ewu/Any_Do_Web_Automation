package com.inetbanking.testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

@SuppressWarnings("unused")
public class TC_LoginTest_001 extends BaseClass {

	


	@Test
	public void LoginTest_1() throws InterruptedException
	{
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.clickSubmit1();
		lp.setUserName(username);
		logger.info("Entered username");
		//Thread.sleep(3000);
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		//Thread.sleep(3000);
		//lp.clickSubmit2();
		Thread.sleep(3000);
		logger.info("Click Add note");
		lp.clickSubmit3();
		logger.info("typing note");
		Thread.sleep(3000);
		lp.clickSubmit4(notetask);
		//logger.info("Added Task");
		//Thread.sleep(3000);
		//lp.clickSubmit7(notetask2);
		//logger.info("Adding 2nd Task");
		//lp.clickSubmit6();
		Thread.sleep(3000);
		logger.info("Task complete");
		lp.clickSubmit5();

		

	}

}
