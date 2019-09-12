package com.ZohoCrm.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ZohoCrm.genericLib.BaseTest;

public class CampaignPage extends BaseTest {

	@FindBy(xpath="//a[.='Campaigns']")
	private WebElement clickCampaign;

	public void clickLogin() {
		clickCampaign.click();

	}

	public CampaignPage() {
		PageFactory.initElements(driver, this);
	}	
}