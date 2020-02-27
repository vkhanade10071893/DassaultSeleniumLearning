package com.dassault.testing.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLocator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\VE3_Medidata\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.rediff.com/");
		
				
		driver.findElement(By.linkText("Rediffmail")).click();
		
				
		WebElement loginbox = driver.findElement(By.id("login1"));
		
		loginbox.sendKeys("Vikram");
		
		WebElement passwordbox = driver.findElement(By.id("password"));
		
		passwordbox.sendKeys("Khanade");
		
		Boolean remebercheckboxoption = driver.findElement(By.name("remeber")).isSelected();
		
		if (remebercheckboxoption == true) {
			driver.findElement(By.name("remeber")).click();
		}
		
		WebElement submittbutton = driver.findElement(By.name("proceed"));
		
		submittbutton.click();
		
		String actual = "Wrong username and password combination.";
		
		String expected = driver.findElement(By.className("div_login_error")).getText();
		
		if (actual.equals(expected)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		
		//driver.close();

	}

}
