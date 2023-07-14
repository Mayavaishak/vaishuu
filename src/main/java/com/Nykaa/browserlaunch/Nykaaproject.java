package com.Nykaa.browserlaunch;

import java.io.File;
import java.io.IOException;
import java.lang.StackWalker.Option;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public abstract class Nykaaproject {
	static WebDriver driver;
	static Actions a;
public static void getdriver(String browserName) {
if(browserName.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();	
}
}
public static void launchurl(String url) {
	driver.manage().window().maximize();
	driver.get(url);	
}
public static void clickonElement(WebElement element) {
	element.click();	
}
public static void input(WebElement element, String string) {
	element.sendKeys("value");	
}
public static void screenshort(String filename) throws IOException {
	TakesScreenshot ts =(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
    File dest = new File("C:\\Users\\Sathish\\Desktop\\IPTJUN0014-Maya\\browserlaunch\\target\\screenshot\\" +filename+ ".png");
    FileHandler.copy(src, dest);
}
public static void dropdownforselect(WebElement element,String option,String value) {
	Select s = new Select(element);
	if(option.equalsIgnoreCase("value"));{
	s.selectByValue(value);		
}
	if (option.equalsIgnoreCase("text")) {
		s.deselectByVisibleText(value);
		}
 
	else if(option.equalsIgnoreCase("index")) {
	int index = Integer.parseInt(value);
		s.selectByIndex(index);
		}
}

public static void switchtoframe(String option,String value){
	if(option.equalsIgnoreCase("index")) {
		int index = Integer.parseInt(value);
		driver.switchTo().frame(index);
	}
	else if (option.equalsIgnoreCase("idorname")) {
		driver.switchTo().frame(value);
		
	}
}
public static void switchtoframe(WebElement element) {
	driver.switchTo().frame(element);	
}
public static void rightclickusingmouse(WebElement element) {
	a = new Actions(driver);
	a.click(element).build().perform();
	}
public static void mouseover(WebElement element) {
	a= new Actions(driver);
	a.moveToElement(element).build().perform();
	
}
public static void draganddrop(WebElement src,WebElement dest) {
	
	a= new Actions(driver);
	a.dragAndDrop(src, dest).build().perform();
}
public static void impliciwait(int sec) {
	driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);	
}
public static void explicitwait(int sec,String condition,WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver,sec);
	if(condition.equalsIgnoreCase("visiblity"));{
	wait.until(ExpectedConditions.visibilityOf(element));
	}
	


}
}
































