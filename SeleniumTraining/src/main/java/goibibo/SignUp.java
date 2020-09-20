package goibibo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUp {
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
	public void signUp() throws InterruptedException {
		driver.findElement(By.id(obj.getProperty("Signup"))).click();
		Thread.sleep(3000);
		driver.switchTo().frame("authiframe");
		driver.findElement(By.cssSelector(obj.getProperty("FBSignInButton"))).click();
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

			String child_window=I1.next();


			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				driver.findElement(By.id(obj.getProperty("FBEmailBox"))).sendKeys(obj.getProperty("FBEmail"));
				driver.findElement(By.id(obj.getProperty("FBPassword"))).sendKeys(obj.getProperty("Password"));
				driver.findElement(By.xpath(obj.getProperty("LoginButton"))).click();
				Thread.sleep(3000);
			}
		}

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


