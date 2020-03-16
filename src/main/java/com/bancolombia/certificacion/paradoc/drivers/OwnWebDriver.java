package com.bancolombia.certificacion.paradoc.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OwnWebDriver {

	private static WebDriver driver;
	
	public static OwnWebDriver hisBrowserWeb() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jfbuiles\\Desktop\\Trabajo Broker\\Archivos importantes\\Driver selenium\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		//options.addArguments("--incognito");
		driver= new ChromeDriver(options);
		return new OwnWebDriver();
	}
	
	public WebDriver on(String url) {
		driver.get(url);
		return driver;
	
	}
	
}