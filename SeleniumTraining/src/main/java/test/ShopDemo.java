package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class ShopDemo {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.out.println("launching chrome browser");
		String chromeDriverPath = System.setProperty("user.dir","\\chromedriver.exe");
		System.out.println(chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test (priority = 0) 
	public void signup() throws InterruptedException {
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.cssSelector("#sign-username")).sendKeys("pushpak");
		driver.findElement(By.cssSelector("#sign-password")).sendKeys("demo@1234");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")));
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		driver.close();
	}

	@Test (priority = 1) 
	public void login() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.cssSelector("#loginusername")).sendKeys("pushpak");
		driver.findElement(By.cssSelector("#loginpassword")).sendKeys("demo@1234");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")));
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		driver.close();
	}
	@Test (priority = 2)
	public void contact() {
		driver.findElement(By.linkText("Contact")).click();
		driver.findElement(By.cssSelector("#recipient-email")).sendKeys("pushpakm13@gmail.com");
		driver.findElement(By.cssSelector("#recipient-name")).sendKeys("pushpak");
		driver.findElement(By.cssSelector("#message-text")).sendKeys("hello");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")));
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
		driver.switchTo().alert().accept();
		driver.close();
	}
	@Test (priority = 3)
	public void addcart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]")).click();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")));
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Cart")).click();
		driver.close();

	}

	@AfterTest
	public void quitbrowser() {
		driver.quit();
	}

}
