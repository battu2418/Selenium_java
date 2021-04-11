package consumerenergy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ConsumerEnergyPayement<driver> {
	private static final boolean False = false;
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
	public void setUpTest() throws InterruptedException{
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/Chromedriver83/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);

	}
	@Test
	public void test1() throws InterruptedException{
		ExtentTest test = extent.createTest("Consumer Energy Payment", "Monthly Payment");
		test.log(Status.INFO, "Starting Test case Excecution");
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Consumer Energy");
		test.pass("Entered CONSUMER ENERGY text in Search textboox");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(5000);
		test.pass("Entered CONSUMER ENERGY Page Opened");
		//driver.findElement(By.name("userName")).sendKeys("battu2418@gmail.com");
		driver.findElement(By.xpath("//input[@id='userNameLoginBlock']")).sendKeys("battu2418@gmail.com");
		driver.findElement(By.xpath("//*[@id='passwordLoginBlock']")).sendKeys("Welcome@2425");
		//driver.findElement(By.name("password")).sendKeys("Welcome@2425");
		test.pass("Consumer Login credentials Sucessfull in user Loggin window.");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		test.pass("Consumer Login Functionality  validation Sucessfull.");
		Actions actions = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath("/html/body/div[5]/header/div[2]/div/div/div[1]/nav/ul/li[1]/div/button/span"));
		actions.moveToElement(mainMenu).click().build().perform();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='currentBalanceAndPlans']/div[1]/div/div/div/button")).click();
		Thread.sleep(20000);
		driver.findElement(By.id("payflowcontinueSubmit")).click();
		Thread.sleep(20000);
		//actions.click().build().perform();
		  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
		    // now copy the  screenshot to desired location using copyFile method
		   
		   FileUtils.copyFile(src, new File("C:/Workspace/"+System.currentTimeMillis()+".png"));
		         }
		   
		  catch (IOException e)
		   
		  {
		   
		  System.out.println(e.getMessage());
		   
		      }

	}

	@Test(enabled=False)
	public void test2(){
		ExtentTest test2 = extent.createTest("Login Module", "Seacrhing functionality");

		test2.log(Status.INFO, "Login Module case Excecution");
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
