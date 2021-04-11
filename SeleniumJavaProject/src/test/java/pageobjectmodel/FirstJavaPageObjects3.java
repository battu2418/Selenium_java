package pageobjectmodel;
import pageobjectmodel.GoogleSearchPage2;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJavaPageObjects3 {

	private static WebDriver driver= null;

	public static void main(String[] args) throws InterruptedException {
		googleSearch();

	}

	public static void googleSearch() throws InterruptedException{

		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/Chromedriver83/chromedriver.exe");
		driver = new ChromeDriver();

		// call POM Call to insert page object functions
		GoogleSearchPage2 pageObject2 = new GoogleSearchPage2(driver);
		driver.get("https://www.google.com");
		pageObject2.setTextInSearchBox("bhanu");
		pageObject2.clickGoogleSearchButton();

		Thread.sleep(5000);
		System.out.println("Chroome page Search results are ready to close");

		driver.close();
		System.out.println("Chroome page Search Testing has been completed");
	}

}
