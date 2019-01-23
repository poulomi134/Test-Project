package com.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pages.CrmLogin;
import com.pages.RenewCustomer;
import com.test.base.TestBase;

public class RenewCustomerTest extends TestBase {
	
	/*@Test
	public void RenewCust() throws InterruptedException
	{
		System.out.println("Verify Login");
		CrmLogin clog = new CrmLogin().initElements();
		clog.Login("techsupport", "Welcome@123");
		RenewCustomer renew = new RenewCustomer().initElements();
		renew.Renew();
	}
*/
	@DataProvider(name="Login")
	 public static Object[][] credentials() {
		 
        return new Object[][] { { "techsupport", "Welcome@123" }};
}
        
       
        @Test(dataProvider = "Login")
        public void verifyLogin(String u, String pwd) throws InterruptedException {
    	
    		System.out.println("Verify Login");
    		CrmLogin clogin = new CrmLogin().initElements();
    		clogin.Login(u,pwd);
    		RenewCustomer renew = new RenewCustomer().initElements();
    		renew.Renew();
    		//Object title;
			//Assert.assertEquals(title, expected);
    		
    	}
}
