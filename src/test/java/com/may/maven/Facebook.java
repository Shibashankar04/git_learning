package com.may.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	
	@Test
	public static void facebookLogin() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stark\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//input[@type='email']")).sendKeys("buna.sahoo54@gmail.com");
		
		driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("090224488");
		
		driver.findElement(By.xpath(".//input[@value='Log In']")).click();
		
		WebElement name=driver.findElement(By.xpath(".//span[@class='_1vp5']"));
		
		System.out.println(name.getText());
		
		driver.quit();
	}

}
