package com.zoho.Test;

import org.testng.annotations.Test;

import com.ZohoCrm.genericLib.BaseTest;
import com.ZohoCrm.pom.ContactsPage;


public class CreateContactTest extends BaseTest {
	@Test
	public void ClickContact() {
		
		ContactsPage cp= new ContactsPage();
		cp.clickContact();
		
		
		
}
}