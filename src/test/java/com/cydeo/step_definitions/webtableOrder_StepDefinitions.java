package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebtableOrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class webtableOrder_StepDefinitions {

    WebTableLoginPage loginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();
    WebtableOrderPage orderPage = new WebtableOrderPage();
    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        //getting the page using the URL from configuration.properties
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
       //calling our login method to log in to web table app
        loginPage.login();
        //clicking to "order" link to go to order page
        basePage.order.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select = new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);
    }

//    @When("user enters quantity {string}")
//    public void user_enters_quantity(String string) {
//
//    }
    @And("user enters quantity {int}")
    public void userEntersQuantity(int quantity) {
        //clear() method will delete whatever is in the input box
        //orderPage.inputQuantity.clear();
        //imitating pressing back_space button from keyboard to delete existing input
        orderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);
        //accepting int argument and sending it using sendKeys() method
        //since sendKeys() method only accepts String, we need to either concat with ""
        //or send String.valueOf(int);
        orderPage.inputQuantity.sendKeys(""+quantity);
        //orderPage.inputQuantity.sendKeys(String.valueOf(quantity));
    }

    @When("user enters costumer name {string}")
    public void user_enters_costumer_name(String string) {
        orderPage.inputName.sendKeys(string);
    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {
        orderPage.inputStreet.sendKeys(string);
    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPage.inputCity.sendKeys(string);
    }

    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderPage.inputState.sendKeys(string);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        orderPage.inputZip.sendKeys(string);
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {
        //this line will loop through the list and decide which radio button to click
        BrowserUtils.clickRadioButton(orderPage.creditCardType, expectedCardType);
    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        orderPage.cardNoInput.sendKeys(string);
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        orderPage.cardExpInput.sendKeys(string);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        orderPage.processOrderButton.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedName) {
        String actualName = viewAllOrdersPage.newCustomerCell.getText();
        Assert.assertEquals(expectedName, actualName);
    }


}
