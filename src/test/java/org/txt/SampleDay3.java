package org.txt;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleDay3 {

	// public because we pass the driver to each method so globally
	public static WebDriver driver;

	@BeforeClass
	private void browserLanch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bharath\\Desktop\\Mediacal Wipro\\Bharath\\target\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@AfterClass
	private void endBrowser() {
		driver.close();
	}

	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void endTime() {
		Date f = new Date();
		System.out.println(f);
	}

	@Test
	private void test1() {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bharath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("omg");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	
	}


