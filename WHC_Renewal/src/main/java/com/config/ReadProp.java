package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadProp {

	
	public static void main(String args[]) throws IOException
	
	{
		//how to read properties file: 
		WebDriver driver = null;
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Poulomi.sarkar\\Documents\\Automation\\WHC_Renewal\\src\\"
				+ "main\\java\\com\\config\\config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Poulomi.sarkar\\Documents\\Automation\\WHC_Renewal\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			//System.setProperty("webdriver.chrome.driver", "user.dir"+"\\Drivers\\chromedriver.exe"); path for geckodriver
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}
		else 
			System.out.println("No browser value");
		driver.get(prop.getProperty("url"));
			
		driver.findElement(By.id(prop.getProperty("username_id"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id(prop.getProperty("login_btn"))).click();
		
		
		
		
		
	}
}
