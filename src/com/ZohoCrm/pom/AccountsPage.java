package com.ZohoCrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage {
	
	
	@FindBy(linkText="Accounts") 
	private WebElement accCreateBtn;
	public void AccClick()
	{
		accCreateBtn.click();
	}

	@FindBy(xpath="//input[@onclick='createAction()']")
	private WebElement CreateAccBtn;
	public void newAccount()
	{
		CreateAccBtn.click();
	}

	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement clickLogin;
	public void clickLoginBtn() 

	{
		clickLogin.click();
	}


	public void LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}


