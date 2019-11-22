package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleSearch {
    @Given("user is on the google homepage")
    public void user_is_on_the_google_homepage() {

        Driver.getDriver().get("http://google.com");
    }

    GoogleSearchPage gsp= new GoogleSearchPage();
    @Given("user enters flowers keyword")
    public void user_enters_flowers_keyword() {
gsp.searchBox.sendKeys("Flowers");
    }

    @When("user clicks search button")
    public void user_clicks_search_button() {
gsp.searchClick.click();
    }

    @Then("user should see result related to flowers")
    public void user_should_see_result_related_to_flowers() {
String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue("Keyword flowers was not located in title",actualTitle.contains("flowers"));
    }

}
