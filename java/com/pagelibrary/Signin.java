package com.pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signin {
public WebDriver driver;
By smail=By.id("ap_email");
By spass=By.id("ap_password");
By sclic=By.id("signInSubmit");
public Signin(WebDriver driver)
{
	this.driver=driver;
}
public void smaill(String id1)
{
	driver.findElement(smail).sendKeys(id1);
}
public void spasss(String pass1)
{
	driver.findElement(spass).sendKeys(pass1);
}
public void sclicc(){
	driver.findElement(sclic).click();
}
}
