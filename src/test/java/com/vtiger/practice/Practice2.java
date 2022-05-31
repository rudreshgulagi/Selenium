package com.vtiger.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice2 {

	@Test
	public void practice()
	{
	String browser=System.getproperty("BROWSER");
	Reporter.log(browser, true);
Reporter.log("practice", true);
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
