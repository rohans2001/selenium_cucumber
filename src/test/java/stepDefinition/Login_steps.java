package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_steps {
	@Given("user is in login page")
	public void user_is_in_login_page() {
		System.out.println("user is in login page");

	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("user enter username and password");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on login button");

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user is navigated to the home page");

	}

}
