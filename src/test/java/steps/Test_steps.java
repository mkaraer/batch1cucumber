package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Test_steps {
    @When("user goes to google application")
    public void user_goes_to_google_application() {
        System.out.println("user is going to google");

    }

    @Then("uset searches for apples")
    public void uset_searches_for_apples() {
        System.out.println("user is searching for apple");


    }

    @Then("user should see apple related results")
    public void user_should_see_apple_related_results() {
        System.out.println("user is seeing apple");

    }

    @Then("user test something")
    public void user_test_something() {
        System.out.println("user is testing");
        Assert.fail("failing for some resasond");
    }

}
