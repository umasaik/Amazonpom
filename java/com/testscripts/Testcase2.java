package com.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pagelibrary.Createaccount;
import com.pagelibrary.Signin;
import com.testbase.Browsing;

public class Testcase2 extends Browsing {
	Createaccount acc;
	Signin sign;
	@BeforeClass
	public void launch() throws Exception
	{
		initt();
	}
  @Test
  public void sigininfun() {
	  acc=new Createaccount(driver);
	  sign=new Signin(driver);
	  acc.signin();
	  sign.smaill("umasai20@gmail.com");
	  sign.spasss("saisrinivas");
	  sign.sclicc();
  }
}
