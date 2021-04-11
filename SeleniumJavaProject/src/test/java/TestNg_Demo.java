import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Demo {

	static WebDriver driver = null;

	@BeforeTest

	public void setUpTest() throws InterruptedException{

		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);

		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/Chromedriver83/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
	}

	@Test
	public void google_Search() {

		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("Automation step by step");

		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		//List<WebElement> listofInputElements = driver.findElements(By.xpath("//*[@id="tsf"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		//int count = listofInputElements.size();
		//System.out.println("Count of input elements=" +count );
	}
		
		@Test
		public void google_Search2() {

			driver.get("https://www.google.com");

			driver.findElement(By.name("q")).sendKeys("Automation step by step");

			driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

	}

	@AfterTest

	public void tearDownTest() throws InterruptedException{

		Thread.sleep(5000);

		driver.close();

	}
}
