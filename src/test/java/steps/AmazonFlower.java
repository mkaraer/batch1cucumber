package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonFlowerPage;
import utilities.Driver;

public class AmazonFlower {



    AmazonFlowerPage amazonFlower=new AmazonFlowerPage();
    @Then("user should write flower and click on searchbox")
    public void user_should_write_flower_and_click_on_searchbox() {
   amazonFlower.researchBox.sendKeys("flowers"+ Keys.ENTER);
    }

    @Then("user should see flower is displayed")
    public void user_should_see_flower_is_displayed() {
        String title =amazonFlower.headtitle.getText();
Assert.assertTrue(title.contains("flowers"));
    }

}
