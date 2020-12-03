package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
public void setUp() {
	initialisation();
	loginpage=new LoginPage();
	
}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
	String title=	loginpage.validateLoginPage();
	Assert.assertEquals(title, "OrangeHRM");
	}
	@Test(priority=2)
	public void loginTest() {
		homepage=loginpage.login(prop.getProperty("user"), prop.getProperty("password"));
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
