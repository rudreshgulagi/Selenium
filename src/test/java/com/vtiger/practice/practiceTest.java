package com.vtiger.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class practiceTest {
	@Test
	public void practice()
	{
	
Reporter.log("practice", true);
		String browser=System.getProperty("browser");
	Reporter.log(browser, true);
	}
	@Test
	public void practice1()
	{
		Reporter.log("practice1", true);
	}
	public void practice2()
	{
		Reporter.log("practice2", true);
	}
}



