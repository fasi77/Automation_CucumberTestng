package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	public void SwitchtoOfferPage() {
		Set<String> windows=driver.getWindowHandles();
	    Iterator<String> iterator=windows.iterator();
	    String parentwindow=iterator.next();
	    String childwindow=iterator.next();
	    driver.switchTo().window(childwindow);
	}
}
