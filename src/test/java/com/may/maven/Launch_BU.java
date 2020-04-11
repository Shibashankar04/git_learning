package com.may.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_BU {
	
	@Test
	public void home_bu() throws InterruptedException
	{

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://lms2-staging.benchmarkuniverse.com/?realm=impel");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
