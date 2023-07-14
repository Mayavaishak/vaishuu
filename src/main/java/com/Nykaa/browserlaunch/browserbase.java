package com.Nykaa.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public abstract class browserbase {
	static WebDriver driver;
public static void getdriver(String browserName) {
if(browserName.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();	
}
 else if (browserName.equalsIgnoreCase("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();	
}
else if (browserName.equalsIgnoreCase("edge")) {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();}

}
	public static void main(String[] args) {
		
	}

}
