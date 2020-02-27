package com.dassault.testing.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class XpathExampleDestinationQA {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\VE3_Medidata\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://destinationqa.com/aut-samplepersonalinformationform/");
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vikramsingh");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Khanade");
		
		driver.findElement(By.xpath("//input[@name='address']")).clear();
		
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Nanded City");
		
		driver.findElement(By.xpath("//p[text()='Phone :']/following-sibling::p/input")).sendKeys("9673007905");
		
		driver.findElement(By.xpath("//div[@id='PIform2']//input[1]")).click();
		
		driver.findElement(By.xpath("//p[3]//input[1]")).click();
		
		driver.findElement(By.xpath("//p[3]//input[2]")).click();
		
		driver.findElement(By.xpath("//select[contains(@name,'Colors')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[contains(text(),'Blue')]")).click();
		
		driver.findElement(By.xpath("//input[@name= 'user']")).sendKeys("vkhanade");
		
		driver.findElement(By.xpath("//input[@name= 'pwd']")).sendKeys("vkhanade");
		
		driver.findElement(By.xpath("//input[@type= 'submit']")).click();

	}

}
