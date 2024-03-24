package pageObjects;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {
	
	WebDriver driver;
	public LandingPageobject landingpage;
	public OfferPageObject offerspage;
	
	public pageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LandingPageobject getLandingpageobject() {
		landingpage=new LandingPageobject(driver);
		return landingpage;
	}
	
	public OfferPageObject getOfferspageobject() {
		offerspage=new OfferPageObject(driver);
		return offerspage;
	}

	
	
}
