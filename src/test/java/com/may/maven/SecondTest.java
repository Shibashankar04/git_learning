package com.may.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
	
	
	@Test
	public static void findName() {
		System.setProperty("webdriver.chrome.driver", "D:\\sham\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https:/www.google.com");

		String title=driver.getTitle();

		System.out.println(title);

		driver.quit();
	}

}
