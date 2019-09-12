package com.zoho.Test;

import org.testng.annotations.Test;

import com.ZohoCrm.genericLib.BaseTest;
import com.ZohoCrm.pom.CampaignPage;

public class CreateCampaignTest extends BaseTest{
	
	
	@Test
	public void CreateNewCampaign() {
		
		CampaignPage cp= new CampaignPage();
		cp.clickLogin();
		
		
		
	}

}
