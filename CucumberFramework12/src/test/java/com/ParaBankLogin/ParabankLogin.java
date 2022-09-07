package com.ParaBankLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParabankLogin {
	@Given("User is able to navigating the login page")
	public void user_is_able_to_navigating_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("The application is lunched");
	}

	@When("User name and Password is entered")
	public void user_name_and_password_is_entered() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User Name and Password is entered");
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Button is clicked");
	}

	@Then("Display the log in homeage")
	public void display_the_log_in_homeage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home Page is displayed");
	}

	@Then("logout the application")
	public void logout_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Logout of the application");
	}

	@Then("close the applicaton")
	public void close_the_applicaton() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Close the application");
	}

}
