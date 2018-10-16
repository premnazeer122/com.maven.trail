package com.uitilityfiles;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

public class CommonMethods extends configReader {

	public WebDriver driver;
	
	
	
	
	/**
	 * Created all commonly used methods in this java file and can be called any
	 * where by call this class and it's methods.
	 */

	public String getChromePath() {
		String path = data.getProperty("ChromeDriver");
		return path;

	}

	public String getURL() {
		return data.getProperty("URL");
	}

	public String getusername() {
		return data.getProperty("username");

	}

	public String getpassword() {
		return data.getProperty("psw");

	}
	
	public String getusername1() {
		return data.getProperty("username1");

	}

	public String getpassword1() {
		return data.getProperty("password1");

	}
	

	public String getpsw() {
		return data.getProperty("password");

	}

	public String getFireox_driver() {
		return data.getProperty("browserName");

	}

	public String getChrome_driver() {
		return data.getProperty("browserName1");

	}

	
	public void close() {
		driver.close();

	}

	public WebElement findElement(By arg0) {
		return driver.findElement(arg0);
	}

	public List<WebElement> findElements(By arg0) {
		return driver.findElements(arg0);
	}

	public void get(String arg0) {
		driver.get(arg0);

	}

	public String getCurrentUrl() {
		
		return driver.getCurrentUrl();
	}

	public String getPageSource() {
		return driver.getPageSource();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getWindowHandle() {
		return driver.getWindowHandle();
	}

	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	public Options manage() {
		return driver.manage();
	}

	public Navigation navigate() {
		return driver.navigate();
	}

	public void quit() {
		driver.quit();
	}

	public TargetLocator switchTo() {
		return driver.switchTo();
	}
		
}
