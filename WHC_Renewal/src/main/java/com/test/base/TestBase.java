package com.test.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.utilities.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	static Properties prop;
	
	@BeforeMethod
	public void setUpDriver()
	{
		long pageTimeOut = 0;
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path +"\\Drivers\\chromedriver.exe");
		//String applicationUrl = "https://uat2crm.1atesting.in/index.php?action=Login&module=Users&login_module=Users&login_action=EditView&login_record=ba4c6c08-2b2e-8a96-a836-582569c4f07c";
		String applicationUrl = "https://qa2crm.1atesting.in/index.php?module=Users&action=Login";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(applicationUrl);
		//driver.get(adminUrl);
		
	}
	public TestBase() {
		
		try {
			 prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Poulomi.sarkar\\Documents\\Automation\\WHC_Renewal\\src\\"
					+ "main\\java\\com\\config\\config.properties");
			prop.load(ip);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		}
	
	public static void initialization() {
		
		String browser = prop.getProperty("browser");
		
		
		
	}
	}
	


