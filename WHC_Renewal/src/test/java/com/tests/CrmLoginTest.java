package com.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pages.CrmLogin;
import com.test.base.TestBase;

public class CrmLoginTest extends TestBase{
	
	/* @Test
	
	
	public void verifyLogin() {
		
		
		System.out.println("Verify Login");
		CrmLogin clogin = new CrmLogin().initElements();
		clogin.Login("techsupport","Welcome@123");
		
	} */
	
	@DataProvider(name = "Authentication")
	 
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "techsupport", "Welcome@123" }};
	}
	        
	       
	        @Test(dataProvider = "Authentication")
	        public void verifyLogin(String u, String pwd) {
	    	
	    		System.out.println("Verify Login");
	    		CrmLogin clogin = new CrmLogin().initElements();
	    		clogin.Login(u,pwd);
	    		
	    	}
	        
	        @AfterTest
	        public void TearDown() {
	        	driver.quit();
	        }
	
	
	

	}

