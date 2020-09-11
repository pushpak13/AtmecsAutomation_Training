package test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;


public class AnnotationTest {

	public String baseUrl = "http://www.atmecs.com/";
	String driverPath = "C:\\Users\\pushpak.madhavan\\eclipse-workspace\\SeleniumTraining\\drives\\firefox driver\\geckodriver.exe";
	public FirefoxDriver driver; 
	public String expected = null;
	public String actual = null;
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		System.out.println("launching firefox browser"); 
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver= new FirefoxDriver();
		driver.get(baseUrl);
		Thread.sleep(3000);
	}

	@BeforeMethod
	public void verifyHomepageTitle() throws InterruptedException {
		String expectedTitle = "Home | Atmecs, Inc. | Digital Solutions & Product Engineering Services";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(2000);
	}
	@Test (priority = 0)
	public void AboutUs() throws InterruptedException{
		driver.findElement(By.linkText("About Us")).click() ;
		expected = "About Us | Atmecs, Inc. | Digital Solutions & Product Engineering Services";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
	}

	@Test (priority = 1)
	public void Careers() throws InterruptedException {
		driver.findElement(By.linkText("Careers")).click() ;
		expected = "Careers | Atmecs, Inc. | Digital Solutions & Product Engineering Services";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
	}



	@AfterMethod
	public void goBackToHomepage ( ) throws InterruptedException {
		driver.findElement(By.linkText("Home")).click() ;
		Thread.sleep(2000);
	}

	@AfterTest
	public void terminateBrowser(){
		driver.close();
	}



}




	