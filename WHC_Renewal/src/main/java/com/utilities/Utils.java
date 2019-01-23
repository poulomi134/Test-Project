package com.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.base.TestBase;

public class Utils  {
	
	public static void DropDown(WebElement element, String s)
	{
		Select select = new Select(element);
		select.selectByVisibleText(s);		
	}

	public static void Wait(WebElement element2)
	{
		WebDriverWait wait = new WebDriverWait(TestBase.driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(element2));
	}
	
	public static void JavascriptExecutor(WebElement element3)
	{
		JavascriptExecutor js = ((JavascriptExecutor) TestBase.driver);
		js.executeScript("arguments[0].click()", element3);
	}
	
	public static void Actions(WebElement element4)
	{
		Actions action = new Actions(TestBase.driver);
		action.moveToElement(element4).build().perform();
	}
	
	
}
