package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchDemo {

	@Test
	public void DemoLauch() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// Open facebook
		driver.get("http://www.google.com");

		// Maximize browser

		driver.manage().window().maximize();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
}