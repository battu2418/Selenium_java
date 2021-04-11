package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapbablilitesDemo {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.ie.driver", projectpath+"/drivers/IEdriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Consumer Energy");
		//test.pass("Entered CONSUMER ENERGY text in Search textboox");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
	}

}
