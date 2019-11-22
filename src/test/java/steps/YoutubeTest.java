package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.YoutubePage;
import utilities.Driver;

import java.security.Key;

public class YoutubeTest {
YoutubePage ytbp=new YoutubePage();
    @Given("user is on the youtube homepage")
    public void user_is_on_the_youtube_homepage() {
        Driver.getDriver().get("http://youtube.com");
    }

    @Given("user is able to see the search box")
    public void user_is_able_to_see_the_search_box() {
Assert.assertTrue(ytbp.searchBox.isDisplayed());
    }

    @Given("user is able to see search button")
    public void user_is_able_to_see_search_button() {
Assert.assertTrue(ytbp.YoutubeSearchButton.isDisplayed());
    }

    @When("user searches for Funny Cat Videos")
    public void user_searches_for_Funny_Cat_Videos() throws InterruptedException {
ytbp.searchBox.sendKeys("Funny Cat Videos"+ Keys.ENTER);
Thread.sleep(2000);
    }

    @Then("user should see results related to funny cat videos")
    public void user_should_see_results_related_to_funny_cat_videos() {
        String title=Driver.getDriver().getTitle();
        String ecpected="Cat";
        Assert.assertTrue("Does not contain",title.contains(ecpected));
    }
    @When("user searches for Funny Dog Videos")
    public void user_searches_for_Funny_Dog_Videos() throws InterruptedException {
ytbp.searchBox.sendKeys("Funny Dog Videos"+Keys.ENTER);
        Thread.sleep(2000);

    }

    @Then("user should see results related to funny dog videos")
    public void user_should_see_results_related_to_funny_dog_videos() {
        String title=Driver.getDriver().getTitle();
        String ecpected="Dog";
        Assert.assertTrue("Does not contain",title.contains(ecpected));
    }
    @When("user searches for Funny Pet Videos")
    public void user_searches_for_Funny_Pet_Videos() throws InterruptedException {

ytbp.searchBox.sendKeys("Funny Pet Videos"+Keys.ENTER);
Thread.sleep(2000);
    }

    @Then("user should see results related to funny pet videos")
    public void user_should_see_results_related_to_funny_pet_videos() {
        String title=Driver.getDriver().getTitle();
        String ecpected="Pet";
        Assert.assertTrue("Does not contain",title.contains(ecpected));
    }



}
