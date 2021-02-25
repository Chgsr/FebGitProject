package com.maven.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavendemo {
	
	@Test
	public void Demo()
	{
		System.out.println(" Maven Demo Test");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	}

}
