import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Code to navigate to the login page
        System.out.println("User is on the login page");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        // Code to enter username and password
        System.out.println("User enters username and password");
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        // Code to click on the login button
        System.out.println("User clicks on login button");
    }

    @Then("user is navigated to homepage")
    public void user_is_navigated_to_homepage() {
        // Code to verify navigation to the homepage
        System.out.println("User is navigated to the homepage");
    }
}