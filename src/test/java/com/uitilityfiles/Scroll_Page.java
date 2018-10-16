package com.uitilityfiles;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll_Page {

	public static WebDriver driver;

	public WebDriver scroll_up(){
		JavascriptExecutor scrollup = ((JavascriptExecutor) driver);
		scrollup.executeScript("window.scrollBy(0,-450)", "");
		return driver;
	}
	
	public WebDriver scroll_down(){
		JavascriptExecutor scrolldown = ((JavascriptExecutor) driver);
		scrolldown.executeScript("window.scrollBy(0,450)", "");
		return driver;
	}
}
