package com.pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Createaccount {
WebDriver driver;
By sign=By.xpath("//*[@id='nav-link-accountList']/span[1]");
By acc=By.id("createAccountSubmit");
By start=By.linkText("Start here.");
By name=By.id("ap_customer_name");
By mail=By.id("ap_email");
By pass1=By.id("ap_password");
By pass2=By.id("ap_password_check");
By click=By.id("continue");

public Createaccount(WebDriver driver)
{
	this.driver=driver;
}
public void signin()
{
 driver.findElement(sign).click();
}

public void account()
{
	driver.findElement(acc).click();
}
public void name1(String fname){
	driver.findElement(name).sendKeys(fname);
	
}
public void email(String id)
{
	driver.findElement(mail).sendKeys(id);
}
public void password(String pass){
	driver.findElement(pass1).sendKeys(pass);
}
public void verification(String word)
{
	driver.findElement(pass2).sendKeys(word);
}
public void clicking()
{
	driver.findElement(click).click();
}
}
