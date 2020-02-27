package com.dassault.testing.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","D:\\VE3_Medidata\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String actual = driver.getTitle();

		String expected = "Google";
		
		if (actual.equals(expected)) {
			System.out.println("Test Pass");
		}else
			System.out.println("Test fail");
		
		
		//driver.close();
		
		//driver.quit();
	}

}
