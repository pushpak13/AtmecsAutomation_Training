package com.atmecs.selenium.training;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomateDemo {
	 WebDriver driver;
	

	@BeforeMethod
	public void setUp() throws InterruptedException {
		System.out.println("launching chrome browser");
		String chromeDriverPath = System.setProperty("user.dir","\\chromedriver.exe");
		System.out.println(chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test   
	public void register() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("pushpak");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("madhavan");
		driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("mysore");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//multi-select/div[2]/ul/li[8]")).click();
		Select skills = new Select(driver.findElement(By.id("Skills")));
		skills.selectByValue("Java");
		Thread.sleep(2000);
		Select country = new Select(driver.findElement(By.id("countries")));
		country.selectByValue("India");
		Thread.sleep(2000);
		WebElement sel = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		sel.click();
		for(int i=0;i<5;i++)
		{
		sel.sendKeys(Keys.ARROW_DOWN);
		}
		sel.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("yearbox"));
		year.click();
		for(int i=0;i<30;i++)
		{
			year.sendKeys(Keys.ARROW_DOWN);
		}
		year.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//*[@ng-model='monthbox']"));
		month.click();
		for(int i=0;i<3;i++)
		{
		month.sendKeys(Keys.ARROW_DOWN);
		}
		month.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("daybox"));
		day.click();
		for(int i=0;i<20;i++)
		{
			day.sendKeys(Keys.ARROW_DOWN);
		}
		day.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("firstpassword")).sendKeys("Demo@1234");
		driver.findElement(By.id("secondpassword")).sendKeys("Demo@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		Thread.sleep(9000);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}


















