package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WikipediaPage;
import utilities.Driver;

import java.security.Key;

public class Wikipedia {
WikipediaPage wikipedia=new WikipediaPage();

    @Given("User on the wikipedia homepade")
    public void user_on_the_wikipedia_homepade() {
        Driver.getDriver().get("http://wikipedia.org");
    }

    @When("User enters steve jobs to search bar and clicks enter")
    public void user_enters_steve_jobs_to_search_bar_and_clicks_enter() {
      wikipedia.Searchbox.sendKeys("Steve Jobs"+ Keys.ENTER);
    }

    @Then("User should see the first header is displayed steve jobs")
    public void user_should_see_the_first_header_is_displayed_steve_jobs() {
        String actualM=wikipedia.firstHeading.getText();
        String expectedM="Steve Jobs";
        Assert.assertTrue(actualM.equals(expectedM));
    }
}
