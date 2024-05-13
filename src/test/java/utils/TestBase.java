package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LandingPage;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream("C://Users/kebaa/workspacecucu/CucumberFramework/src/test/resources/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		
	
				
		if(driver == null)
		{
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")){
				   System.setProperty("webdriver.chrome.driver", "D://driver/chromedriver.exe");  
				   driver = new ChromeDriver();
			}
			if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				
			}
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get(url);
		 driver.manage().window().maximize();
		}
		
		return driver;
		
	}
	
	
	
}

