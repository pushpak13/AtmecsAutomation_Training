package automationdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Register {
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
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test   
	public void register() throws InterruptedException {
		driver.findElement(By.xpath(obj.getProperty("FirstName"))).sendKeys(obj.getProperty("firstname"));
		driver.findElement(By.xpath(obj.getProperty("LastName"))).sendKeys(obj.getProperty("lastname"));
		driver.findElement(By.xpath(obj.getProperty("AddressBox"))).sendKeys(obj.getProperty("Address"));
		driver.findElement(By.xpath(obj.getProperty("EmailAddress"))).sendKeys(obj.getProperty("Email"));
		driver.findElement(By.xpath(obj.getProperty("Phone"))).sendKeys(obj.getProperty("PhoneNo"));
		driver.findElement(By.xpath(obj.getProperty("Gender"))).click();
		driver.findElement(By.id(obj.getProperty("Hobby1"))).click();
		driver.findElement(By.id(obj.getProperty("Hobby2"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(obj.getProperty("LangID"))).click();
		driver.findElement(By.xpath(obj.getProperty("Language"))).click();
		Select skills = new Select(driver.findElement(By.id(obj.getProperty("Skill"))));
		skills.selectByValue(obj.getProperty("SkillName"));
		Thread.sleep(2000);
		Select country = new Select(driver.findElement(By.id(obj.getProperty("Country"))));
		country.selectByValue(obj.getProperty("CountryName"));
		Thread.sleep(2000);
		WebElement sel = driver.findElement(By.xpath(obj.getProperty("SelectCountry")));
		sel.click();
		for(int i=0;i<5;i++)
		{
			sel.sendKeys(Keys.ARROW_DOWN);
		}
		sel.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id(obj.getProperty("Year")));
		year.click();
		for(int i=0;i<30;i++)
		{
			year.sendKeys(Keys.ARROW_DOWN);
		}
		year.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath(obj.getProperty("Month")));
		month.click();
		for(int i=0;i<3;i++)
		{
			month.sendKeys(Keys.ARROW_DOWN);
		}
		month.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id(obj.getProperty("Day")));
		day.click();
		for(int i=0;i<20;i++)
		{
			day.sendKeys(Keys.ARROW_DOWN);
		}
		day.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id(obj.getProperty("Pass"))).sendKeys(obj.getProperty("Passwd"));
		driver.findElement(By.id(obj.getProperty("ConPass"))).sendKeys(obj.getProperty("ConPasswd"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("SubmitBtn"))).click();
		Thread.sleep(9000);

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
