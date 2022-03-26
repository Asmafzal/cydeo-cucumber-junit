package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearOrderPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class SmartBearOrder_StepDefinitions {

    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Process.aspx");
    }

    @When("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String product) {
        Select productDropdown = new Select(smartBearOrderPage.productDropdown);
        productDropdown.selectByVisibleText(product);
    }

    @When("User enters {int} to quantity")
    public void user_enters_to_quantity(Integer int1) {
        smartBearOrderPage.quantityInputBox.clear();
       // smartBearOrderPage.quantityInputBox.sendKeys(int1);
    }

    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters {int}")
    public void user_enters(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters {int} to card number")
    public void user_enters_to_card_number(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
