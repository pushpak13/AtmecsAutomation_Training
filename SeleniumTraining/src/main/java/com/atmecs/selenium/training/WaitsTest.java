package com.atmecs.selenium.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WaitsTest {
	public WebDriver driver;
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		System.out.println("launching chrome browser"); 
		String chromeDriverPath = System.setProperty("user.dir","\\chromedriver.exe");
		System.out.println(chromeDriverPath);
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@Test 
	public void loginTest() throws InterruptedException {
		driver.findElement(By.cssSelector("#username")).sendKeys("dummy@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Password");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Login\"]")));
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
	}
		
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}


}
