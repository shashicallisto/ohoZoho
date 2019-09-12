package com.ZohoCrm.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ZohoCrm.genericLib.BaseTest;

public class ContactsPage extends BaseTest{
	
	@FindBy(xpath="//a[.='Contacts']")
	private WebElement clickContact;

	public void clickContact() {
		clickContact.click();

	}

	 public ContactsPage()  {
		PageFactory.initElements(driver, this);
		System.out.println("Sout");
	}	

}
