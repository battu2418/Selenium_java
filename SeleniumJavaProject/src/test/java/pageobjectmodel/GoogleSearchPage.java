// create a class for each webpage
// create object for each webelement in webpage

package pageobjectmodel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {

	private static WebElement element = null;

	//create a function for every object in webpage

	public static WebElement textbox_Search(WebDriver driver) {

		WebElement element = driver.findElement(By.name("q"));
		return element;	
	}
	//create a function for every object in webpage
	public static WebElement googlesearch_button(WebDriver driver){

		WebElement element = driver.findElement(By.name("btnK"));
		return element;

	}

}
