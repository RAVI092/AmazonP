package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Runner.runnerCls;

public class BaseCls extends runnerCls {


	
	public static void loadUrl(String url)
	{
		d1.get(url);
	}

	public static void waitTime()
	{
		d1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
