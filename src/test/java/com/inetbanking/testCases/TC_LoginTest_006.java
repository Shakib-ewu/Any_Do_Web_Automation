package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_006 extends BaseClass {
	@Test
	public void LoginTest_6() throws InterruptedException
	{
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.clickSubmit1();
		lp.setUserName(username);
		logger.info("Entered username");
		//Thread.sleep(3000);
		lp.setPassword(password);
		logger.info("Entered password");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.clickSubmit();
		Thread.sleep(3000);
		//lp.clickplus();
		logger.info("clicked");
		//lp.clickiconplus();
		//lp.clickplus4();
		//lp.clickiconplus();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		lp.clickarrow();
		
		
	
		
		

	}
}


