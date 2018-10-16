package com.uitilityfiles;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * use the below code to get the method from the confiReader.java in the test
 * script configReader config;
 * 
 * @BeforeTest public void setUp(){ configReader config=new configReader();
 *             system.out.println("webdriver.chrome.driver",config.getChromePath());
 *             }
 * 
 * @Test public void chrome(){ Webdriver driver= new Chromedriver();
 *       driver.get(config.getURL()); driver.quit();
 *
 * 
 */

public class configReader {
	Properties data;

	/**
	 * Created confiReader method to access the data's from property File
	 * source(data driven).
	 */
	public configReader() {
		// TODO Auto-generated constructor stub

		try {
			File src = new File("./configuration/datadriven.property");
			FileInputStream fis = new FileInputStream(src);
			data = new Properties();
			data.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error is ==" + e.getMessage());
		}

	}
	
}
