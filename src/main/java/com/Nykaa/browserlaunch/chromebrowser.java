package com.Nykaa.browserlaunch;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.lang.model.element.Element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class chromebrowser
{
     static WebDriver driver;
	public static void getdrivelaunch(String url) {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		
	}  
	public static void launchurl(String url) {
		driver.manage().window().maximize();
		driver.get(url);	
	}
	public static void ClickonElement(WebElement element) {
		element.click();	
	}
    public static void input(WebElement element , String value) {
			element.sendKeys(value);
    }
       Calendar cal = Calendar.getInstance();
       Date time = cal.getTime();       
       String timestamp = time.toString().replace(":", "").replace(":", "");
    public static void screenshort( String folder, String timestamp) throws IOException {
    	TakesScreenshot ts =(TakesScreenshot)driver;
    	File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\Sathish\\Desktop\\IPTJUN0014-Maya\\browserlaunch\\screenshot" +timestamp+ ".png");
        FileHandler.copy(src, dest);
    }
    
}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
    


