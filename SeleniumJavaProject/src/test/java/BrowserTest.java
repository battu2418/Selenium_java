import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.close();
		
		System.setProperty("webdriver.ie.driver", projectpath+"/drivers/IEdriver/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://google.com");
		driver.close();
			
		
	}

}
