package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.base.TestBase;
import com.utilities.Utils;

public class UpgradeCustomer extends TestBase {
	
	Utils util = new Utils();
	public UpgradeCustomer initElements() {
		
		return PageFactory.initElements(driver, UpgradeCustomer.class);
	}
	
	@FindBy(xpath = "//*[@id='moduleTab_Accounts']")
	WebElement Customers;
	
	@FindBy(xpath="//*[@href='index.php?module=Accounts&action=index&return_module=Accounts&return_action=DetailView']")
	WebElement viewCustomers;
	
	@FindBy(xpath="//*[@href='javascript:void(0)' and @class='glyphicon glyphicon-filter parent-dropdown-handler']")
	WebElement Searchbutton;
	
	@FindBy(xpath="//*[@name = 'listViewNextButton'][1]")
	WebElement next;
	
	@FindBy(xpath="(//a[contains (., 'Quick Filter')])[1]")
	WebElement QuickFilter;
	
	@FindBy(id="customerid_c_basic")
	WebElement CustomerID;
	
	@FindBy(id="phone_advanced")
	WebElement phone;
	
	@FindBy(id="search_form_submit")
	WebElement formSubmit;
	
	/*@FindBy(xpath="//*[@href='index.php?module=Accounts&offset=1&stamp=1546861120021219500&return_module=Accounts&action=DetailView&record=32bec728-9064-2622-8555-5bb73c612aa6']")
	WebElement selectCustomer; */
	
	@FindBy(xpath="(//a[contains (., 'bhavesh kumar COD kumar')])")
	WebElement custName;
	
	/*@FindBy(xpath="(//img[contains (@src,'custom/themes/SuiteR/images/advanced_search.gif?v=3LMJlRpo3yqsPK2XokuwkQ') and contains(@alt,'Show')])[1]")
	WebElement Memberships;*/
	
	@FindBy(xpath="//span[@id='show_link_opportunities']//img")
	WebElement Memberships;
	
	@FindBy(xpath="//*[@class='button primary fleft']")
	WebElement renew;
	
	@FindBy(xpath = "//a[@id='checkListAppliance'] [contains(text(),' Check list here')]")
	WebElement checkList;
	
	@FindBy(xpath="//div[@id='details_popup_div_udben']//a[@class='container-close'][contains(text(),'Close')]")
	WebElement close;
	
	@FindBy(id="upgrade-plan")
	WebElement upgrade;
	
	@FindBy(xpath="//div[@id='renewalprocess']//*[@id='prdPlnCode']")
	WebElement plan;
	
	@FindBy(id= "submitrenewal")
	WebElement submit;
	
	@FindBy(xpath = "//select[@name='pay_mode_c']")
	WebElement pmode;
	
	@FindBy(id= "SAVE")
	WebElement save;
	

	public void Upgrade() throws InterruptedException {
		
		
		Utils.Actions(Customers);
		viewCustomers.click();
		Utils.Wait(Searchbutton);
		Searchbutton.click();
		Utils.Wait(QuickFilter);
		QuickFilter.click();
		Utils.Wait(CustomerID);
		CustomerID.click();
		CustomerID.clear();
		CustomerID.sendKeys("2879187");
		formSubmit.click();
		custName.click();
		Memberships.click();
		//Utils.JavascriptExecutor(next);
		Utils.JavascriptExecutor(renew);
		Thread.sleep(4000);
		Utils.JavascriptExecutor(checkList);
		//checkList.click();
		Thread.sleep(4000);
		close.click();
		upgrade.click();
		Thread.sleep(4000);
		Utils.JavascriptExecutor(plan);
		//plan.click();
		Thread.sleep(2000);
		Utils.JavascriptExecutor(submit);
		Thread.sleep(4000);
		Utils.DropDown(pmode,"Digital Invoice");
		Utils.JavascriptExecutor(save);
		
		
	}


	
	
	
	
	

}
