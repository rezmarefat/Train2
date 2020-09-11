package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	WebDriver Driver;
	@FindBy(name="email")
	WebElement UserId;
	@FindBy(xpath="//*[@type='password']")
	WebElement password;
	@FindBy(xpath="//*[@value='Log In']")
	WebElement login;
	@FindBy(linkText ="Forgot account?")
	WebElement forgotlk;
	
	//create page factory constructure
	public void one(WebDriver driver) {
		this.Driver=driver;
		PageFactory.initElements(driver, this);
	}
	//create meter according to the action
	public void email(String emailfield) {
		UserId.sendKeys(emailfield);
		
	}
	public void pass(String enterpass) {

		password.sendKeys(enterpass);
			
	}
	public void login() {
		login.click();
		
		
		
	}
	public void forgotacc() {
		forgotlk.click();
	}

	}




	 



