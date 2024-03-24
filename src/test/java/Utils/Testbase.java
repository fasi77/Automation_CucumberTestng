package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {

	 public WebDriver driver;
	
	 public WebDriver WebDrverManager() throws IOException {
		 FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties"); 
		 Properties propertyfile=new Properties();
		 propertyfile.load(fis);
		 String browser=propertyfile.getProperty("browser");
		 String url=propertyfile.getProperty("QAurl");
		 if(browser.equalsIgnoreCase("chrome")) {
			 if(driver==null) {
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\eclipse-workspace\\Automation\\target\\chromedriver.exe");
				 driver=new ChromeDriver();
				 driver.get(url);
				 driver.manage().window().maximize();
			 }
		 }
		 if(browser.equalsIgnoreCase("firefox")) {
			 
		 }
		return driver;
	 }
}
