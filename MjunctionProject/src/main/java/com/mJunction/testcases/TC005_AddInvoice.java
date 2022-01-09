package com.mJunction.testcases;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.mJunction.testng.base.ProjectSpecificMethods;
import com.mjuntion.pages.LoginPage;




public class TC005_AddInvoice extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete a Lead - LeafTaps";
		nodes = "Leads";
		dataSheetName="TC005";
		category="Sanity";
		authors="Hari";
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String password, String phoneNum,String errorMsg){

		String firstResultingLead =
			new LoginPage(driver, node)
				.enterUserName(userName)
				.enterPassword(password)
				.clickLogin()
				.clickCRMSFA()
				.clickLeadLink()		
				.clickFindLead()
				.clickPhoneTab()
				.enterPhoneNumberField(phoneNum)
				.clickFindleadsButton()
				.getFirstResultingLead();
		
			
	}
}
