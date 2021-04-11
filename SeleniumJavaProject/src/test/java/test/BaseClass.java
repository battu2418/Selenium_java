package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pageobjectmodel.GoogleSearchPage2;

public class BaseClass {
	static WebDriver driver = null;
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent = null;
	static ExtentTest test1 = null;

	@BeforeSuite
	public void setUp(){
		// Adding Extent reports code
		htmlReporter = new ExtentHtmlReporter("externalReports.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@BeforeTest
	public void setUpTest() throws InterruptedException{

		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver89/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	@Test
	public static void Agoogle_Search_Test() throws InterruptedException {

		ExtentTest test1 = extent.createTest("Testing reports", "Seacrhing functionality");		
		GoogleSearchPage2 GP = new GoogleSearchPage2(driver);
		GP.setTextInSearchBox("Automation Testing");
		Thread.sleep(5000);
		GP.clickGoogleSearchButton();	
		Thread.sleep(5000);
		driver.close();
	}
	
	
	@Test
	public static void Bgoogle_Search_Test2() throws InterruptedException {
		ExtentTest test2 = extent.createTest("Testing reports2", "Seacrhing functionality");		
		GoogleSearchPage2 GP = new GoogleSearchPage2(driver);
		GP.setTextInSearchBox("Automation Testing");
		Thread.sleep(5000);
		GP.clickGoogleSearchButton();
		Thread.sleep(5000);
		driver.close();
	}

	@AfterMethod
	public void tearDownTest() throws InterruptedException{
		Thread.sleep(5000);
		driver.close();
		System.out.println("Teardown step is sucessfully completed");
	}

	@AfterSuite
	public void tearDown(){
		extent.flush();
	}


}


