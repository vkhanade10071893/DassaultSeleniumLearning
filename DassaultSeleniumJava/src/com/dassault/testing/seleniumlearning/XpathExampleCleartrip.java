package com.dassault.testing.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class XpathExampleCleartrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\VE3_Medidata\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com/");
		
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/form[1]/nav[1]/ul[1]/li[2]/label[1]/input[1]")).click();
		
		
		WebElement fromBox = driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/form[1]/div[3]/section[1]/div[1]/dl[1]/dd[1]/span[1]/input[1]"));
		fromBox.sendKeys("Pune");
	
		WebElement toBox = driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/form[1]/div[3]/section[1]/div[3]/dl[1]/dd[1]/span[1]/input[1]"));
		toBox.sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");	
		
		WebElement dateBox = driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/form[1]/div[3]/section[2]/div[1]/dl[1]/dd[1]/div[1]/input[1]"));
		dateBox.click();
		
		
		driver.findElement(By.xpath("//div[@class='monthBlock first']//a[contains(@class,'ui-state-default')][contains(text(),'28')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//td[@data-month='1']/a[text()='29']")).click();
		
		driver.findElement(By.id("Adults")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@name='adults']/option[@value='2']")).click();
		
		//select[@id='Adults']//option[contains(text(),'2')]
		driver.findElement(By.id("SearchBtn")).click();
		
		
		System.out.println(driver.findElement(By.xpath("//h2[@class='totalAmount']")).getText());
		
		//System.out.println(totalAmount);
				
		

	}

}
