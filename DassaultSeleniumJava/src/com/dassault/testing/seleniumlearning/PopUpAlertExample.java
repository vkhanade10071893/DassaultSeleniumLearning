package com.dassault.testing.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlertExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\VE3_Medidata\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("/html[1]/body[1]/button[1]")).click();
		
		Alert myAlert = driver.switchTo().alert();	
		
		myAlert.sendKeys("Vikram");
		
//		myAlert.accept();
//		
//		String actualmessage = driver.findElement(By.id("demo")).getText();
//		
//		String expectedMessage = "Hello Vikram";
//		
//		
//		if (actualmessage.contains(expectedMessage)) {
//			System.out.println("Accepted: Passed");
//		}else {
//			System.out.println("Failed");
//		}
		
		myAlert.dismiss();
		
		try {
		myAlert = driver.switchTo().alert();	
		}catch (NoAlertPresentException e) {
		System.out.println("Alert not more present");
		
		}
	}
		
}
