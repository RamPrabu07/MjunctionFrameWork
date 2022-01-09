package com.mJunction.testcases;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.mJunction.testng.base.ProjectSpecificMethods;
import com.mjuntion.pages.LoginPage;

public class TC001_LoginPage extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "LoginPage";
		testDescription = "Login testCase using Positive Scenario";
		nodes = "Mjunction";
		authors = "Prabhakaran";
		category = "Functional";
		dataSheetName = "TC001";
	}

	@Test(dataProvider = "fetchData")
	public void createLeaf(String uName, String pwd) {
		new LoginPage(driver, node)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickLogout();		
	}


}





