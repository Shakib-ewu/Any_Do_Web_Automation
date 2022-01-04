package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_004 extends BaseClass {
	@Test
	public void LoginTest_4() throws InterruptedException
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
		lp.clickplus();
		Thread.sleep(3000);
		lp.clickiconplus();
		Thread.sleep(3000);
		lp.ListName("-Modify");
		lp.click_ok();
		logger.info("Successfully Completed");

	}
}

