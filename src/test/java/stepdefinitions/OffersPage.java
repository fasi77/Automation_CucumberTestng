package stepdefinitions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.GenericUtils;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;
import pageObjects.OfferPageObject;

public class OffersPage {
	public WebDriver driver;
	public String offersproductname;
	public String productname;
	TestContextSetup testcontext;
	
	public OffersPage(TestContextSetup testcontext) {
		this.testcontext=testcontext;
	}

	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_shortname_in_offers_page(String string) {
		
		OfferPageObject offerspage=testcontext.pageobjectmanager.getOfferspageobject();
		offerspage.Clickofferspage();
		testcontext.genericutils.SwitchtoOfferPage();
	    offerspage.searchItem(string);
	    offersproductname=offerspage.getProductName();
	    
	    System.out.println(offersproductname+" Extracted from offers page");
	}
	
	
	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(testcontext.productname, offersproductname);
	}
}
