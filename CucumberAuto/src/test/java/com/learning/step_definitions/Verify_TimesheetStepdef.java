package com.learning.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Verify_TimesheetStepdef {

	@Given("the user is on the Home Page")
	public void the_user_is_on_the_home_page() {
		System.out.println("the user is on the Home Page");
	}
	@Given("the user clicks on the time option from the menu")
	public void the_user_clicks_on_the_time_option_from_the_menu() {
		System.out.println("the user clicks on the time option from the menu");
	}
	@Given("the user enters the name as {string}")
	public void the_user_enters_the_name_as(String string) {
		System.out.println("the user enters the name as John Smith");

	}
	@Given("clicks on the view button")
	public void clicks_on_the_view_button() {
		System.out.println("clicks on the view button");
	}
	@Then("the user should see the message as {string}")
	public void the_user_should_see_the_message_as(String string) {
		System.out.println("the user should see the message as No Timesheets Found");
	}

}
