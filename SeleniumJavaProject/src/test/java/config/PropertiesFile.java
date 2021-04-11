package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	// create object for properties class
	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties(){
		try{
			
			System.out.println(projectpath);
			
			// create object for Inputstream class
			InputStream input = new FileInputStream(projectpath +"/src/test/java/config/config.properties");
			//load into Properties class
			prop.load(input);
			// Store properties file data
			String browser = prop.getProperty("browser_name");
			String url = prop.getProperty("url_test");
			System.out.println(browser);
			System.out.println(url);
			//ExtentReportsWithTestNG2WithPropertiesFileDemo.browserName = browser;
			
		}
		catch (Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	public static void setProperties(){
		try{
			OutputStream output = new FileOutputStream(projectpath +"/src/test/java/config/config.properties");
			prop.setProperty("browser_name", "Chrome");
			prop.store(output, "Propertiesupates");

		}	catch (Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

}

