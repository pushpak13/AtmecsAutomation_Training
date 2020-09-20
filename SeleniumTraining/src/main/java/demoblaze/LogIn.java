package demoblaze;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogIn {
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

	@Test 
	public void logIn() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.cssSelector("#loginusername")).sendKeys("pushpak");
		driver.findElement(By.cssSelector("#loginpassword")).sendKeys("demo@1234");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
