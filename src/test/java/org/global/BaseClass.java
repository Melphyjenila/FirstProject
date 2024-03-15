package org.global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sujit\\eclipse-workspace\\BasicSelenium\\Driver\\chromedriver.exe" );

		driver = new ChromeDriver();
	}	

public void getUrl(String url) {
	driver.get(url);
}
public void textSend(WebElement element, String keysToSend) {
	element.sendKeys(keysToSend);
}
}
