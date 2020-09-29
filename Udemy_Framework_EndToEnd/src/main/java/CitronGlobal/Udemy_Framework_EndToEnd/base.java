package CitronGlobal.Udemy_Framework_EndToEnd;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base 
{
//Declare Webdriver
	public WebDriver driver = null;
	public Properties prop;
//Method to initialize driver instance
	public WebDriver initializeDriver() throws IOException 
	{
		// Create Properties object to read from config
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"E:\\NEW Drive E Data\\New Radha Workspace Dec 2019\\Project\\Udemy_Framework_EndToEnd\\Config.properties");
		prop.load(fis);

		// Based on browser value from config, launch the respective browser
		switch (prop.getProperty("browser").toLowerCase()) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			/*System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
			driver = new FirefoxDriver();*/
			break;
		case "ie":
			/*System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();*/
			break;

		}
		//Add implicit wait of 10 seconds for elements in the page
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//return driver object
		return driver;
	}
}
