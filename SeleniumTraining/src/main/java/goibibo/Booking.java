package goibibo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Booking {
	WebDriver driver;
	Properties obj;

	@BeforeTest
	public void propertyFile() throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\files.properties");
		obj=new Properties();
		obj.load(file);
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		System.out.println("launching chrome browser");
		String chromeDriverPath = System.setProperty("user.dir","\\chromedriver.exe");
		System.out.println(chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test 
	public void booking() throws InterruptedException {
		WebElement from = driver.findElement(By.id(obj.getProperty("FromID")));
		from.click();
		from.sendKeys(obj.getProperty("From"));
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		WebElement dest = driver.findElement(By.id(obj.getProperty("DestID")));
		dest.click();
		dest.sendKeys(obj.getProperty("Destination"));
		Thread.sleep(2000);
		dest.sendKeys(Keys.ARROW_DOWN);
		dest.sendKeys(Keys.ENTER);
		driver.findElement(By.id(obj.getProperty("DepartureID"))).click();
		driver.findElement(By.id(obj.getProperty("DepartureDate"))).click();
		driver.findElement(By.id(obj.getProperty("ReturnID"))).click();
		driver.findElement(By.id(obj.getProperty("ReturnDate"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(obj.getProperty("TravelDetail"))).click();
		Thread.sleep(2000);
		for(int i=0;i<3;i++)
		{
			driver.findElement(By.id(obj.getProperty("Passengers"))).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.id(obj.getProperty("SearchButton"))).click();
		Thread.sleep(9000);
		driver.close();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

	@ AfterTest
	public void testEnds() {
		System.out.println("Test Ends");
	}


}
