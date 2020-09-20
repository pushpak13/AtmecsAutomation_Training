package com.atmecs.selenium.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class ShopDemo {
	public WebDriver driver;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		System.out.println("launching chrome browser");
		String chromeDriverPath = System.setProperty("user.dir","\\chromedriver.exe");
		System.out.println(chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test (priority = 0) 
	public void signUp() throws InterruptedException {
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.cssSelector("#sign-username")).sendKeys("pushpak");
		driver.findElement(By.cssSelector("#sign-password")).sendKeys("demo@1234");
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,1000);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
	}

	@Test (priority = 1) 
	public void logIn() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.cssSelector("#loginusername")).sendKeys("pushpak");
		driver.findElement(By.cssSelector("#loginpassword")).sendKeys("demo@1234");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
	}
	@Test (priority = 2)
	public void contact() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Contact")).click();
		driver.findElement(By.cssSelector("#recipient-email")).sendKeys("pushpakm13@gmail.com");
		driver.findElement(By.cssSelector("#recipient-name")).sendKeys("pushpak");
		driver.findElement(By.cssSelector("#message-text")).sendKeys("hello");
		driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,2000);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
	}
	@Test (priority = 3)
	public void addCart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Nokia lumia 1520")).click();
		driver.findElement(By.linkText("Add to cart")).click();
		WebDriverWait wait=new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}

	@Test (priority = 4)
	public void validateCart() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Cart")).click();
		driver.close();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
