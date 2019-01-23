package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.base.TestBase;

public class CrmLogin extends TestBase{
	
	public CrmLogin initElements() {
		return PageFactory.initElements(driver, CrmLogin.class);
	}
	
	@FindBy(id="user_name")
	WebElement username;
	
	@FindBy(name="user_password")
	WebElement password;
	
	@FindBy(id="login_button")
	WebElement login;
	
	public void Login(String uname,String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
	
	
	}	

}
