package phptravels;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChatWidget {
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
		driver.get("https://phptravels.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void chat() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.switchTo().frame("chat-widget");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obj.getProperty("ChatIcon"))));
		Thread.sleep(3000);
		WebElement chatButton = driver.findElement(By.xpath(obj.getProperty("ChatIcon")));
		js.executeScript("arguments[0].click();", chatButton);
		Thread.sleep(3000);
		driver.findElement(By.id(obj.getProperty("NameID"))).sendKeys(obj.getProperty("Name"));
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(obj.getProperty("Whatsapp")));
		ele.click();
		ele.sendKeys(obj.getProperty("WhatsappNo"));
		Thread.sleep(2000);
		driver.findElement(By.id(obj.getProperty("EmailBox"))).sendKeys(obj.getProperty("Email"));
		Select client = new Select(driver.findElement(By.xpath(obj.getProperty("ClientDropDown"))));
		client.selectByValue("index1_1");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath(obj.getProperty("StartChat")));
		js.executeScript("arguments[0].click();",button);
		Thread.sleep(3000);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@ AfterTest
	public void testEnds() {
		System.out.println("Test Ends");
	}

}
