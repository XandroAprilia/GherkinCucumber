package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class StepDefsLogin {
	@Given("User is on login page Website")
	public void user_is_on_login_page_website() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Login Menu");
	}

	@When("User enter valid userName")
	public void user_enter_valid_user_name() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Input Valid UserName");
	}

	@And("User enter valid password")
	public void user_enter_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Input Valid Password");
	}

	@And("User click button Login")
	public void user_click_button_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click Button");
	}

	@Then("User redirected to dashboard")
	public void user_redirected_to_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Direct to Dashboard");
	}

	@When("User enter invalid userName")
	public void user_enter_invalid_user_name() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Input InValid UserName");
	}

	@Then("Get invalid user Message")
	public void get_invalid_user_message() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Get Invalid UserName");
	}

	@When("User enter invalid password")
	public void user_enter_invalid_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Input InValid Password");
	}

	@Then("Get wrong password message")
	public void get_wrong_password_message() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Get Wrong Password Message");
	}

}
