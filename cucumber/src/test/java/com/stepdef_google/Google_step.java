package com.stepdef_google;

import java.awt.Robot;

import org.base_class.Reusable_method;
import org.pomgoogle.Google_pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google_step extends Reusable_method {
	
	Google_pom g=new Google_pom(driver);
	@Given("go to the google home page")
	public void go_to_the_google_home_page() {
		
	    geturl("https://www.google.co.in/");
	}
	@When("I want to search a step with as {string}")
	public void i_want_to_search_a_step_with_as(String string) throws Throwable {
	   
		send_keys(g.getSearch(), string);
		enter();
	
		
	}



	@Then("navigate to the appropriate page")
	public void navigate_to_the_appropriate_page() {
	    System.out.println("sucess");
	
	}

}
