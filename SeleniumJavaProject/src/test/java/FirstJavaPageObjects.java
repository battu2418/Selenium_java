import java.util.List;
import pageobjectmodel.GoogleSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJavaPageObjects {

	private static WebDriver driver= null;

	public static void main(String[] args) throws InterruptedException {
		googleSearch();

	}

	public static void googleSearch() throws InterruptedException{

		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/Chromedriver83/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com");

		GoogleSearchPage.textbox_Search(driver).sendKeys("Automation step by step");

		Thread.sleep(5000);

		GoogleSearchPage.googlesearch_button(driver).click();

		System.out.println("called Webelemts using POM method");


		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		//WebElement textbox = driver.findElement(By.name("q"));
		//textbox.sendKeys("Automation step by step");
		//driver.findElement(By.name("q")).click();
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		Thread.sleep(5000);
		System.out.println("Chroome page Search results are ready to close");

		driver.close();
		System.out.println("Chroome page Search Testing has been completed");
	}

}
