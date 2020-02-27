package com.dassault.testing.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExampleFlipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\VE3_Medidata\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		
		WebElement searchBox = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		
		searchBox.sendKeys("Iphone");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*")).click();
		
		//Thread.sleep(5000);
		
		
		String actual = driver.getTitle();
		
		System.out.println(actual);
				
		//String expected	="Iphone";
		
		
		String expected	="Online Shopping Site for Mobiles";
		
				if (actual.contains(expected)) {
					System.out.println("Passed");
				}else 
					System.out.println("Failed");
		
		//driver.close();

	}

}
