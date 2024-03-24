package stepdefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainsteps {
	
	@Given("admin landed on netbanking page")
	public void admin_landed_on_netbanking_page(List<String> data) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User on netbanking page"+data.get(0)+" "+data.get(1));
	}
	
	@Given("^User landed on netbanking page (.+) and (.+)$")
	public void user_landed_on_netbanking_page(String username, int password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User on netbanking page"+username+" "+password);
	}

	
	@When("User log into application")
	public void user_log_into_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User log into application");
	}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home page is displayed");
	}
	@Then("Card details are displayed")
	public void card_details_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User card details are displayed");
	}

	
}
