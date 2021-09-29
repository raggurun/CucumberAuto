package com.learning.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCEONameStepdef {

	@Given("the user is logged in successfully and is on Home Page")
	public void the_user_is_logged_in_successfully_and_is_on_home_page() {
		System.out.println("the user is logged in successfully and is on Home Page");
	}
	@When("the user clicks on the directory option from the Menu bar")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bar() {
		System.out.println("the user clicks on the directory option from the Menu bar");
	}
	@When("the user selects the job title as {string} from the dropdown")
	public void the_user_selects_the_job_title_as_from_the_dropdown(String string) {
		System.out.println("the user selects the job title as CEO from the dropdown");
	}
	@When("clicks the search button")
	public void clicks_the_search_button() {
		System.out.println("clicks the search button");
	}
	@Then("the user should see the CEO name as {string}")
	public void the_user_should_see_the_ceo_name_as(String string) {
		System.out.println("the user should see the CEO name as John Smith");
	}

}
