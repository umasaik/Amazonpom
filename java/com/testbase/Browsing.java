package com.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsing {
public static Properties Repository=new Properties();
public File f;
public FileInputStream fi;
public WebDriver driver;

public void initt() throws Exception{
	loadPropertiesFile();
	selectBrowser(Repository.getProperty("browser"));
	driver.get(Repository.getProperty("url"));
}
public void loadPropertiesFile() throws Exception 
{
	f=new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\configuration\\amazon.properties");
    fi=new FileInputStream(f);
    Repository.load(fi);
   
}
public WebDriver selectBrowser(String browser)
{
	if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","D:\\All Testing\\Browser files\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else
	{
		System.setProperty("webdriver.chrome.driver","D:\\All Testing\\Browser files\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	return driver;
}
}
