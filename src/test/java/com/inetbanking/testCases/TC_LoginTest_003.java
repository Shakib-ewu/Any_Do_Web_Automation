package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_003 extends BaseClass {
	@Test
	public void LoginTest_3() throws InterruptedException
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
		lp.clickicon();
		logger.info("Entered My Friday Task");
		Thread.sleep(3000);
		//lp.clickicon2();
		logger.info("Entered Sub Task");

}
}
