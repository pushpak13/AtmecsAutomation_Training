package test;

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
import org.testng.annotations.Test;

public class PhpChatWidget {
	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Open LiveChat chat widget']")));
		Thread.sleep(3000);
		WebElement chatButton = driver.findElement(By.xpath("//div[@aria-label='Open LiveChat chat widget']"));
		js.executeScript("arguments[0].click();", chatButton);
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("xyz");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//input[@class='lc-1gz7fd7 e1xplv9i0'])[2]"));
		ele.click();
		ele.sendKeys("9012456780");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abd@gmail.com");
		Select client = new Select(driver.findElement(By.xpath("//select[@class='lc-jjhb0i egtcv0s1']")));
		client.selectByValue("index1_1");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click();",button);
		Thread.sleep(3000);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}





