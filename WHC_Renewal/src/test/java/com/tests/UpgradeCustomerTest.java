package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pages.CrmLogin;
import com.pages.UpgradeCustomer;
import com.test.base.TestBase;

public class UpgradeCustomerTest extends TestBase{
	
	@Test
	public void UpdateCust() throws InterruptedException {
		
		System.out.println("Verify Login");
		CrmLogin clog = new CrmLogin().initElements();
		clog.Login("techsupport", "Welcome@123");
		System.out.println("Verify Upgrade");
		UpgradeCustomer up = new UpgradeCustomer().initElements();
		up.Upgrade();
		
	}

}
