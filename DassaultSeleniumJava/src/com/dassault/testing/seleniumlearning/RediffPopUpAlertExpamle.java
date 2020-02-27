package com.dassault.testing.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffPopUpAlertExpamle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\VE3_Medidata\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.rediff.com/");
		
				
		driver.findElement(By.linkText("Rediffmail")).click();
		
				
		WebElement loginbox = driver.findElement(By.id("login1"));
		
			
		WebElement passwordbox = driver.findElement(By.id("password"));

		WebElement submittbutton = driver.findElement(By.name("proceed"));
		
		submittbutton.click();
		
		
		Thread.sleep(2000);
		
		
		Alert myAlert = driver.switchTo().alert();		
		
		String accualmessage = myAlert.getText();
		
		String ecpectedMessage = "Please enter a valid user name";
		
		if (accualmessage.contains(ecpectedMessage)) {
			System.out.println("Alert captured");
			myAlert.accept();
		}else {
			System.out.println("Alert not seen");
		}
		
		//driver.close();

	}

}
