package com.stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ParabankkLogin {

	@Given("User is able to navigating the login page")
	public void user_is_able_to_navigating_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Application is lunched");
	}

	@When("username and password are entered")
	public void username_and_password_are_entered() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User Name and password is entered");
	}

	@And("click on the loging button")
	public void click_on_the_loging_button() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Login button is clicked");
	}

	@Then("Display the user home page")
	public void display_the_user_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Homepage is displayed");
	}

	@And("logout the application")
	public void logout_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("logout of the Application");
	}

	@And("close the application")
	public void close_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Close the Application ");
	} 
	}