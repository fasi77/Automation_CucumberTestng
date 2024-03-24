package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPageobject {
	
	public WebDriver driver;
	
	public LandingPageobject(WebDriver driver) {
		this.driver=driver;
	}
	
	By search=By.xpath("//input[@type='search']");
	By productname=By.cssSelector("h4.product-name");
	
	public void searchItem(String string) {
		driver.findElement(search).sendKeys(string);
	}
	
	public String getProductname(String string) {
		return driver.findElement(productname).getText().split("-")[0].trim();
		
	}
	
}
