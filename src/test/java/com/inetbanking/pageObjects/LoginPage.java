package com.inetbanking.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)   //creating a constructor
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	
	@FindBy(xpath="//div[contains(text(),'Continue with Facebook')]")
	@CacheLookup
	WebElement btnSelect;

	@FindBy(id="email")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(id="pass")
	@CacheLookup
	WebElement txtPassword;


	@FindBy(id="loginbutton")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[5]/button[1]/*[1]")
	@CacheLookup
	WebElement myftask;

	@FindBy(tagName="input")
	@CacheLookup
	WebElement myftask2;
	
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[3]/nav[1]/ul[1]/li[3]/div[1]/div[2]/div[1]/button[1]/*[1]")
	@CacheLookup
	WebElement plus;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/nav[1]/ul[1]/li[3]/div[2]/ul[1]/li[4]/a[1]/div[2]")
	@CacheLookup
	WebElement myfridaytask;
	
	
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[3]/nav[1]/ul[1]/li[3]/div[2]/ul[1]/li[1]/div[1]/button[1]/*[1]")
	@CacheLookup
	WebElement plusbutton;
	
	
	
	@FindBy(tagName="textarea")
	@CacheLookup
	WebElement listname;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	@CacheLookup
	WebElement saveclick;
	
	
	
	@FindBy(xpath="//header/div[1]/div[1]/div[3]/button[1]")
	@CacheLookup
	WebElement searchsetting;
	
	
	
	
	
	@FindBy(xpath="//div[contains(text(),'Theme')]")
	@CacheLookup
	WebElement searchtheme;
	
	@FindBy(xpath="//div[contains(text(),'My Profile')]")
	@CacheLookup
	WebElement searchmyaccount;
	
	@FindBy(xpath="//div[contains(text(),'Sign Out')]")
	@CacheLookup
	WebElement signout;
	
	
	
	
	@FindBy(xpath="//label[1]")
	@CacheLookup
	WebElement changetheme;
	
	@FindBy(xpath="//input[1]")
	@CacheLookup
	WebElement changetheme1;
	
	
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/button[1]/span[2]")
	@CacheLookup
	WebElement btnLogin3;
	
	@FindBy(tagName="textarea")
	@CacheLookup
	WebElement btnLogin4;
	
	@FindBy(tagName="textarea")
	@CacheLookup
	WebElement btnLogin7;
	
	@FindBy(xpath="//button[2]")
	@CacheLookup
	WebElement btnLogin6;
	
	
	
	@FindBy(xpath="//strong[contains(text(),'Add Task')]")
	@CacheLookup
	WebElement btnLogin5;
	
	
	
	
	
	@FindBy(xpath="//button")
	@CacheLookup
	WebElement doublearrow;
	
	@FindBy(xpath="//button[1]/*[1]")
	@CacheLookup
	WebElement tagicon;
	
	
	
	@FindBy(xpath="//button[contains(text(),'No, thanks')]")
	@CacheLookup
	WebElement nothanks;
	
	
	public void clickSubmit1()
	{
		btnSelect.click();
	}
	public void setUserName(String uname)       //Action method
	{
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}


	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	public void clickicon()
	{
		myftask.click();
	}
	
	public void clickplus()
	{
		plus.click();
	}
	
	public void clickplus4()
	{
		myfridaytask.click();
	}
	
	
	public void clickiconplus()
	{
		plusbutton.click();
	}
	
	public void ListName(String Listname)       //Action method
	{
		listname.sendKeys(Listname);
	}
	
	public void click_ok()
	{
		saveclick.click();
	}
	
	public void clicksetting()
	{
		searchsetting.click();
	}
	
	public void clicktheme()
	{
		searchtheme.click();
	}
	
	public void clickmyaccount()
	{
		searchmyaccount.click();
	}
	
	public void Signoutaccount()
	{
		signout.click();
	}
	
	
	
	public void Changetheme()
	{
		changetheme.click();
	}
	
	public void Changetheme1()
	{
		changetheme1.click();
	}


	
	public void clickicon2()
	{
		myftask2.click();
	}
	
	
	
	public void clickSubmit3()
	{
		btnLogin3.click();
	}
	
	public void clickSubmit4(String Nname)
	{
		btnLogin4.sendKeys(String.valueOf(Nname));
	}
	
	public void clickSubmit7(String Nname2)
	{
		btnLogin7.sendKeys(String.valueOf(Nname2));
	}
	
	
	
	
	public void clickSubmit6()
	{
		btnLogin6.click();
	}
	
	
	public void clickSubmit5()
	{
		btnLogin5.click();
	}
	
	public void clickarrow()
	{
		doublearrow.click();
	}
	
	public void clicktag()
	{
		tagicon.click();
	}
	
	public void Nothanks()
	{
		nothanks.click();
	}
	}


