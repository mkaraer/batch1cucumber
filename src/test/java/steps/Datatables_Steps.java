package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DatatablePage;
import utilities.Driver;

public class Datatables_Steps {

DatatablePage dtp=new DatatablePage();
    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }
    @Given("User clicks to new button")
    public void user_clicks_to_new_button() {
dtp.newButton.click();
    }

    @Then("user should see create new entry Box")
    public void user_should_see_create_new_entry_Box() {

        Assert.assertTrue(dtp.header.isDisplayed());
    }

    @Then("user should enter firstName")
    public void user_should_enter_firstName() {
dtp.firstName.sendKeys("Metin");
    }

    @Then("user should enter lastName")
    public void user_should_enter_lastName() {
dtp.lastName.sendKeys("Kara");
    }

    @Then("user should enter Position")
    public void user_should_enter_Position() {
dtp.position.sendKeys("QI");
    }

    @Then("user should enter office")
    public void user_should_enter_office() {
dtp.office.sendKeys("114");
    }

    @Then("user should enter Extension")
    public void user_should_enter_Extension() {
dtp.extention.sendKeys("2");
    }

    @Then("user should enter startDate")
    public void user_should_enter_startDate() {
dtp.startDate.sendKeys("2019-10-10");
    }

    @Then("user should enter salary")
    public void user_should_enter_salary() {
dtp.salary.sendKeys("125000");
    }
    @Then("user should enter firstName {string}")
    public void user_should_enter_firstName(String firstName) {
       dtp.firstName.sendKeys(firstName);
    }

    @Then("user should enter lastName {string}")
    public void user_should_enter_lastName(String lastName) {
        dtp.lastName.sendKeys(lastName);
    }
    @Then("user should enter Position {string}")
    public void user_should_enter_Position(String string) {
       dtp.position.sendKeys(string);
    }

    @Then("user should enter office {string}")
    public void user_should_enter_office(String office) {
       dtp.office.sendKeys(office);
    }

    @Then("user should enter Extension {string}")
    public void user_should_enter_Extension(String Extension) {
        dtp.extention.sendKeys(Extension);
    }

    @Then("user should enter startDate {string}")
    public void user_should_enter_startDate(String string) {
       dtp.startDate.sendKeys(string);
    }

    @Then("user should enter salary {string}")
    public void user_should_enter_salary(String string) {
        dtp.salary.sendKeys(string);
    }
    @Then("user enters first name {string}to serach box")
    public void user_enters_first_name_to_serach_box(String string) {
        dtp.search.sendKeys(string);
    }
    @Then("user should see first name {string}is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table(String string) throws InterruptedException {
        String actual=dtp.firstResult.getText();
        String expected=string;
        Thread.sleep(1000);
        Assert.fail();
        Assert.assertTrue(actual.contains(expected));
    }


    @Then("user should click the create button")
    public void user_should_click_the_create_button() throws InterruptedException {
        Thread.sleep(2000);
dtp.createButton.click();
    }

    @Then("user enters first name to serach box")
    public void user_enters_first_name_to_serach_box() {
        dtp.search.sendKeys("Metin");
    }

    @Then("user should see first name is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table() {
        String actual=dtp.firstResult.getText();
        String expected="Metin";
Assert.assertTrue(actual.contains(expected));

    }

}
