package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleParametersSteps {
GoogleSearchPage gsp= new GoogleSearchPage();

    @Given("user is on the homepage of googele")
    public void user_is_on_the_homepage_of_googele() {
        Driver.getDriver().get("https://google.com");
    }

    @When("user enters {string}")
    public void user_enters(String string) {
gsp.searchBox.sendKeys(string+ Keys.ENTER);
    }

    @Then("user should see {string} in the tile")
    public void user_should_see_in_the_tile(String string) {
String actualTitle= Driver.getDriver().getTitle();
String expectedTitle= string+ "-Google Search";
Assert.assertEquals("this is not matching", actualTitle,expectedTitle);
    }

}
