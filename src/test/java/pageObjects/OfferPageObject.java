package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPageObject {
	public WebDriver driver;
	
	public OfferPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	By search=By.xpath("//input[@type='search']");
	By offerspage=By.linkText("Top Deals");
	private By productName = By.cssSelector("tr td:nth-child(1)");
	
	
	
	public void searchItem(String string) {
		driver.findElement(search).sendKeys(string);
	}
	
	public void Clickofferspage()
	{
		driver.findElement(offerspage).click();
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	
}
