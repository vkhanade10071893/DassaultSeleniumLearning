package com.dassault.testing.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\VE3_Medidata\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		
		searchbox.sendKeys("Selenium");
		
		WebElement searchbutton = driver.findElement(By.className("gNO89b"));
		
		//searchbutton.wait(50000);
		
		searchbutton.click();
		
		//driver.findElement(By.linkText("Selenium")).click();
		
		driver.findElement(By.linkText("Books")).click();
		
		driver.findElement(By.partialLinkText("Learn Selenium in 1 Day")).click();
		
		driver.close();

	}

}
