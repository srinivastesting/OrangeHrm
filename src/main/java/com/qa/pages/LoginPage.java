package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id="txtUsername")
	WebElement user_name;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement btn_signup;
	
public LoginPage() {
	PageFactory.initElements(driver, this);
}

public String validateLoginPage() {
	return driver.getTitle();
}
public HomePage login(String name,String pwd) {
	user_name.sendKeys(name);
	password.sendKeys(pwd);
	btn_signup.click();
	
	return new HomePage();
}

	
	
}
