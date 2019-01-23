package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.base.TestBase;

public class RenewCustomer extends TestBase{
	
	WebDriverWait wait = new WebDriverWait(driver,20);
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	

	public RenewCustomer initElements() {
		
		return PageFactory.initElements(driver, RenewCustomer.class);
	}
	
	@FindBy(xpath = "//*[@id='moduleTab_Accounts']")
	WebElement Customers;
	
	@FindBy(xpath="//*[@href='index.php?module=Accounts&action=index&return_module=Accounts&return_action=DetailView']")
	WebElement viewCustomers;
	
	@FindBy(xpath="//*[@href='javascript:void(0)' and @class='glyphicon glyphicon-filter parent-dropdown-handler']")
	WebElement Searchbutton;
	
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
	
	@FindBy(xpath="//*[@name = 'listViewNextButton'][1]")
	WebElement next;
	
	@FindBy(xpath="//*[@name='listViewNextButton']")
	WebElement next2;
	
	@FindBy(xpath="//*[@class='button primary fleft']")
	WebElement renew;
	
	@FindBy(id= "submitrenewal")
	WebElement submit;
	
	@FindBy(id="whc_contact_no")
	WebElement no;
	
	@FindBy(xpath="//textarea[@id='whc_address_line2']")
	WebElement line2;
	
	@FindBy(xpath = "//select[@name='pay_mode_c']")
	WebElement pmode;
	
	@FindBy(id= "SAVE")
	WebElement save;
	
	public void Renew() throws InterruptedException {
		
		System.out.println("it came here");
		Actions action = new Actions(driver);
		action.moveToElement(Customers).build().perform();
		//Customers.click();
		viewCustomers.click();
		System.out.println("it came here");
		wait.until(ExpectedConditions.elementToBeClickable(Searchbutton));
		Searchbutton.click();
		wait.until(ExpectedConditions.elementToBeClickable(QuickFilter));
		QuickFilter.click();
		wait.until(ExpectedConditions.elementToBeClickable(CustomerID));
		CustomerID.clear();
		CustomerID.sendKeys("2879187");
		System.out.println("it came here");
		formSubmit.click();
		custName.click();
		Memberships.click();
		js.executeScript("arguments[0].click()", next);
		//wait.until(ExpectedConditions.elementToBeClickable(next));
		System.out.println("it came till here");
		//next.click();
		System.out.println("it came here as well");
		//js.executeScript("arguments[0].click()", next2);
		//wait.until(ExpectedConditions.elementToBeClickable(next2));
		//next2.click();
		js.executeScript("arguments[0].click()", renew);
		//wait.until(ExpectedConditions.elementToBeClickable(renew));
		//renew.click();
		Thread.sleep(2000);
		//js.executeScript("arguments[0].click()", renew);
		js.executeScript("arguments[0].click()", submit);
		//wait.until(ExpectedConditions.elementToBeClickable(submit));
		//submit.click();
		Thread.sleep(4000);
		no.getText();
		System.out.println("Mobile is"+no.getText());
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", line2); 
		Select dropdown = new Select(pmode);
		dropdown.selectByVisibleText("Digital Invoice");
		js.executeScript("arguments[0].click()", save);
		//save.click();
	}	
		
	
}
