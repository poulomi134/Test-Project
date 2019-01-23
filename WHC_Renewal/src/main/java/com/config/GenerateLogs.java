package com.config;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateLogs {

	public static void main(String args[])
	
	{
		Logger log = Logger.getLogger(GenerateLogs.class);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Poulomi.sarkar\\Documents\\Automation\\WHC_Renewal\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		log.info("launching browser");
		
		driver.get("http://www.google.com");
		log.info("google url has been launched");
		
		String title = driver.getTitle();
		System.out.println("Title value is" +title);
		
		log.info("Title value is" +title);
		
		
		if(title.equals("Google")) { 
			
			System.out.println("title is google");
			log.info("test passed");
		}
		else
			System.out.println("title is not google");
		log.info("test failed");
		
		
		
	}
}
