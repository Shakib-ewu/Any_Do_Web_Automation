package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_005 extends BaseClass {
	@Test
	public void LoginTest_5() throws InterruptedException
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
		lp.clickSubmit();
		Thread.sleep(3000);
		lp.clicksetting();
		Thread.sleep(3000);
		logger.info("click theme");
		lp.clicktheme();
		Thread.sleep(3000);
		lp.Changetheme();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		lp.Changetheme1();
		logger.info("change theme");
		

	}
}


