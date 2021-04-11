import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJavaUsingMethod {

	public static void main(String[] args) throws InterruptedException {
		googleSearch();

	}

	public static void googleSearch() throws InterruptedException{

		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/Chromedriver83/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		//driver.findElement(By.name("q")).sendKeys("Automation step by step");

		WebElement textbox = driver.findElement(By.name("q"));

		textbox.sendKeys("Automation step by step");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.xpath("//[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")).click();

		System.out.println("Chroome page opened with Search results");

		Thread.sleep(5000);
		System.out.println("Chroome page Search results are ready to close");

		driver.close();
		System.out.println("Chroome page Search Testing has been completed");
	}

}
