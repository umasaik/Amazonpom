package com.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pagelibrary.Createaccount;
import com.testbase.Browsing;

public class Testcase1 extends Browsing {
	Createaccount acc;
	@BeforeClass
	public void set() throws Exception
	{
		initt();
	}
  @Test
  public void up() {
	  acc=new Createaccount(driver);
	  acc.signin();
	  acc.account();
	  acc.name1("umasai");
	  acc.email("umasai20@gmail.com");
	 acc.password("saisrinivas");
	 acc.verification("saisrinivas");
	 acc.clicking();
  }
}
