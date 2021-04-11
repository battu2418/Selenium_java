// create a class for each webpage
// create object for each webelement in webpage

package pageobjectmodel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage2 {

	WebDriver driver = null;
	By textbox_loc = By.name("q");
	By goolesearchbutton_loc = By.name("btnK");

	public  GoogleSearchPage2(WebDriver driver){
		this.driver = driver;

	}

	//create a function for every object in webpage
	public void setTextInSearchBox(String text) {

		driver.findElement(textbox_loc).sendKeys(text);
	}

	//create a function for every object in webpage
	public void clickGoogleSearchButton() {

		driver.findElement(goolesearchbutton_loc).sendKeys(Keys.RETURN);

	}

}
