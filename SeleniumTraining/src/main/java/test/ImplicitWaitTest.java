package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import org.testng.annotations.Test;

public class ImplicitWaitTest {
	
	@Test
	public void gotopage() throws InterruptedException {
		System.out.println("launching chrome browser"); 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pushpak.madhavan\\eclipse-workspace\\SeleniumTraining\\drives\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.atmecs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"menu-item-29\"]/a")).sendKeys("Careers");
		String expTitle = "Careers | Atmecs, Inc. | Digital Solutions & Product Engineering Services";
		String actTitle = driver.getTitle();
		if (actTitle.equals(expTitle))
		{
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.close();
	}
}























