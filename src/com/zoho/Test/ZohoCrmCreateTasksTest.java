package com.zoho.Test;

import org.testng.annotations.Test;

import com.ZohoCrm.genericLib.BaseTest;
import com.ZohoCrm.genericLib.WebDriverCommonLib;
import com.ZohoCrm.pom.EnterTimeTrackPage;

public class ZohoCrmCreateTasksTest extends BaseTest{

	@Test
	public void createTaskByClickingOnCreateTaskBtn() throws InterruptedException
	{
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageLoad();
		Thread.sleep(8000);
		
	}
	
}
