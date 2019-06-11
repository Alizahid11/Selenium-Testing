package myPackage_tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSel {
	static WebDriver driver;
	String url = "http:\\www.google.com";

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public static void teardown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void mthodTest() {
		driver.get(url);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		we.sendKeys("cute Kittens");
		we.sendKeys(Keys.ENTER);
		we=driver.findElement(By.xpath("//*[@id=\"imagebox_bigimages\"]/g-section-with-header/div[1]/h3/a"));
		assertEquals("Images for cute Kittens",we.getText());
		
	}	
		
		
		
		//assertTrue(we.getText().contains("cute"));
	

//
//	@Test
//	public boolean FirstTest() {
//
//		return true;
//	}

	
	
}