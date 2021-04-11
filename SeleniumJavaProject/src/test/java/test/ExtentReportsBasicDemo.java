package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("externalReports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		
		ExtentTest test = extent.createTest("Google Search Test One", "Seacrhing functionality");

		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/Chromedriver83/chromedriver.exe");
		driver = new ChromeDriver();

		test.log(Status.INFO, "Starting Test case Excecution");
		driver.get("https://www.google.com");


		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test.pass("Entered text in Search textboox");

		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.pass("Click on Search button");

		driver.close();
		driver.quit();
		test.info("Testing completed");

		
		
		
		
		ExtentTest test2 = extent.createTest("Google Search Test two", "Seacrhing functionality");

		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/Chromedriver83/chromedriver.exe");
		driver = new ChromeDriver();

		test2.log(Status.INFO, "Starting Test case Excecution");
		driver.get("https://www.google.com");


		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test2.pass("Entered text in Search textboox");

		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test2.fail("Click on Search button");

		driver.close();
		driver.quit();
		test.info("Testing completed");
		
		extent.flush();

	}



}
