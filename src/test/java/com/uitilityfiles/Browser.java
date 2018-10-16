package com.uitilityfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

	/**
	 * This function will execute before each Test tag in testng.xml
	 * 
	 * @return
	 * 
	 * @throws Exception
	 * 123
	 * 
	 */
	
	public class Browser  {

		static WebDriver driver;
		

		public static WebDriver DriverStart(String browserName, String url) {
			

			if (browserName.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\CTRSAutomation\\chromedriver.exe");
				System.out.println("Chrome driver is selected and started");
				driver = new ChromeDriver();
			}
				else if (browserName.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
				System.out.println("Firefox driver is selected and started");
				}
				else if (browserName.equalsIgnoreCase("ie")){
				driver = new InternetExplorerDriver();
				System.out.println("IE driver is selected and started");
				}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			return driver;

		}

		

	}


