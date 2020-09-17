package test;

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
	public WebDriver driver;
	String DriverPath = "C:\\Users\\pushpak.madhavan\\eclipse-workspace\\SeleniumTraining\\drives\\chrome driver\\chromedriver.exe";
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver",DriverPath);
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
	    Select skills = new Select(driver.findElement(By.id("Skills")));
	    skills.selectByValue("Java");
	    Thread.sleep(2000);
	    Select country = new Select(driver.findElement(By.id("countries")));
	    country.selectByValue("India");
	    Thread.sleep(2000);
	    Select year = new Select(driver.findElement(By.id("yearbox")));
	    year.selectByValue("1989");
	    Thread.sleep(2000);
	    Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
	    month.selectByValue("March");
	    Thread.sleep(2000);
	    Select day = new Select(driver.findElement(By.id("daybox")));
	    day.selectByValue("20");
	    Thread.sleep(2000);
	    driver.findElement(By.id("firstpassword")).sendKeys("demo@1234");
	    driver.findElement(By.id("secondpassword")).sendKeys("demo@1234");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
	    Thread.sleep(9000);
	    
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  
	

