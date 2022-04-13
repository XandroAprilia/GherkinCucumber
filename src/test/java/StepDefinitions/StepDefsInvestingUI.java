package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefsInvestingUI {
	
	@Given("Click Investing Board")
	public void click_investing_board() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("On Dashboard");
	}

	@When("First Title must {string}")
	public void first_title_must(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("First Title");
	}

	@When("The First Content Text is {string}")
	public void the_first_content_text_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("First Content");
	}

	@Then("I validate the Title Text and Content Text")
	public void i_validate_the_title_text_and_content_text() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Validate First Title");
	}

	@When("Second Title must {string}")
	public void second_title_must(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Second Title");
	}

	@When("The Second Content is Picture")
	public void the_second_content_is_picture() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Second Content");
	}

	@Then("I validate the Title Text and Content Picture")
	public void i_validate_the_title_text_and_content_picture() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Validate Second Content");
	}

	@When("Third Title must {string}")
	public void third_title_must(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Thrid Title");
	}

	@When("The Third Content First Text is {string} and Komisi Cost {string}")
	public void the_third_content_first_text_is_and_komisi_cost(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Thrid Content");
	}

	@When("The Third Content Second Text is {string} and Komisi Cost {string}")
	public void the_third_content_second_text_is_and_komisi_cost(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Thrid Content");
	}

	@When("Fourth Title must {string}")
	public void fourth_title_must(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Fourth Content");
	}
	
	@When("The Fouth Content is Chart Comparison")
	public void the_fouth_content_is_chart_comparison() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Fourth Cart Content");
	}

	@Then("I validate the Title Text and Cart Comparison")
	public void i_validate_the_title_text_and_cart_comparison() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Validate Fourth Cart Content");
	}

	@When("Fifth Title must {string}")
	public void fifth_title_must(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Fifth Content");
	}

	@When("The Fifth Content is Chart Comparison")
	public void the_fifth_content_is_chart_comparison() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Fifth Content");
	}
}
