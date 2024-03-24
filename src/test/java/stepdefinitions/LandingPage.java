package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPageobject;



public class LandingPage {
	
	public WebDriver driver;
	public String productname;
	public String offersproductname;
	TestContextSetup testcontext;
	
	public LandingPage(TestContextSetup testcontext) {
		this.testcontext=testcontext;
	}

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() throws IOException {
		testcontext.testbase.WebDrverManager();
	}
	@When("^user searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String string) throws InterruptedException {
		LandingPageobject landingpage=testcontext.pageobjectmanager.getLandingpageobject();
	    landingpage.searchItem(string);
	    Thread.sleep(2000);
	    testcontext.productname=landingpage.getProductname(string);
	    System.out.println(testcontext.productname+" Extracted from landing page");
	}
	
}
