package com.dassault.testing.seleniumlearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class XpathExampleFlipkartExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\VE3_Medidata\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		
		WebElement searchBox = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		
		searchBox.sendKeys("Iphone");
		
		//Explicit Wait
		WebDriverWait mywait = new WebDriverWait(driver,10);
		mywait.pollingEvery(2,TimeUnit.SECONDS);
		WebElement lastsuggestion = driver.findElement(By.xpath("//li[@class='_1va75j'][last()]"));
		mywait.until(ExpectedConditions.textToBePresentInElement(lastsuggestion,"iphone"));
		
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='_1va75j']"));
	
		for (WebElement suggestion: suggestions) {
		System.out.println(suggestion.getText());
		
	}
		
		
	}

}
