package consumerenergy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsWithTestNG<driver> {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent ;
	static WebDriver driver = null;


	@BeforeSuite
	public void setUp(){
		htmlReporter = new ExtentHtmlReporter("externalReports.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@BeforeTest
	public void setUpTest() throws Exception{
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/Chromedriver83/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
		

	}
	@Test
	public void test1(){
		ExtentTest test = extent.createTest("Google Search Test One", "Seacrhing functionality");

		test.log(Status.INFO, "Starting Test case Excecution");
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test.pass("Entered text in Search textboox");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.pass("Click on Search button");

	}

	@Test
	public void test2(){
		ExtentTest test2 = extent.createTest("Google Search Test two", "Seacrhing functionality");

		test2.log(Status.INFO, "Starting Test case Excecution");
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test2.pass("Entered text in Search textboox");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test2.pass("Click on Search button");

	}


	@AfterTest
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
