package com.tantaio.PageObject;

import com.tantaio.Library.AppLibrary;

public class Login {
	private AppLibrary appLibrary;
	public static String skip="xpath:0b6c178a-9b54-40d4-b393-cf40079acc0f";
	public static String login="xpath:0b4155aa-ce21-461d-81f7-4da2c639c4b2";
	public static String emailadd="xpath:b0502fc5-d16a-474f-98f7-cb97b8a608ef";
	public static String password="xpath:0118b8ea-e766-4819-a5b9-9bc623f2d00b";
	public static String loginbtn="xpath:0407eeca-e479-4646-8950-d3945da854dd";
	
	
	
	
	
	public Login (AppLibrary appLibrary)
	{
		this.appLibrary = appLibrary;
		 appLibrary.getCurrentDriverInstance();
	}
	
	public Login Login_page(String email,String pwd) throws Exception
	{
		appLibrary.clickElement(skip);
		appLibrary.clickElement(login);
		appLibrary.enterText(emailadd, email);
		appLibrary.enterText(password, pwd);
		appLibrary.clickElement(loginbtn);
		
		return new Login(appLibrary);
	}

}
