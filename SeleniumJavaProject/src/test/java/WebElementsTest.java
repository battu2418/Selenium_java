import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsTest {

	public static void main(String[] args) throws InterruptedException {


		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);

		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/Chromedriver83/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("Automation step by step");

		WebElement textbox = driver.findElement(By.name("q"));

		textbox.sendKeys("Automation step by step");

		//List<WebElement> listofInputElements = driver.findElements(By.xpath("//*[@id="tsf"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		//int count = listofInputElements.size();
		//System.out.println("Count of input elements=" +count );	

		Thread.sleep(5000);

		driver.close();


	}

}
