package com.tantaio.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tantaio.Library.AppLibrary;
import com.tantaio.Library.TestBase;
import com.tantaio.PageObject.Login;



public class LoginTest extends TestBase
{
	@BeforeClass
	public void setUp() throws Exception {
			appLibrary = new AppLibrary("Login");
	}
	
	@Test
	public void Login_Test() throws Exception
	{
		appLibrary.getDriverInstance();
		
		new Login(appLibrary).Login_page("user143","Strange!");
	}

}
