package com.tantaio.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tantaio.Library.AppLibrary;
import com.tantaio.Library.TestBase;

public class LoginTestPage extends TestBase
{
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("TestLoginpage");
	}

	@Test
	public void TestSampleLoginPage() throws Exception
	{
		appLibrary.getDriverInstance();
		
	}
}
