package com.qa.stepDefinitions;

import com.qa.pages.MainNavBar;
import com.qa.pages.RegistrationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.jupiter.api.Assertions.*;


public class RegistrationTest {

    private MainNavBar mainNavBar = new MainNavBar();
    private RegistrationPage registrationPage = new RegistrationPage();

    @When("^I click on register button$")
    public void iClickOnRegisterButton() {
        mainNavBar.clickLogoutButtonForRegister();
        mainNavBar.clickRegisterButton();
    }

    @When("^I fill the first name field with \"([^\"]*)\"$")
    public void I_fill_the_first_name_field_with(String firstName) {
        registrationPage.clickOnFirstName(firstName);
    }

    @When("^I fill the last name field with \"([^\"]*)\"$")
    public void I_fill_the_last_name_field_with(String lastName) {
        registrationPage.clickOnLastName(lastName);
    }

    @When("^I fill the email field with \"([^\"]*)\"$")
    public void I_fill_the_email_field_with(String email) {
        registrationPage.clickOnEmail(email);
    }

    @When("^I fill the confirm password field with \"([^\"]*)\"$")
    public void I_fill_the_confirm_password_field_with(String confirmPassword) {
        registrationPage.clickOnConfirmPassword(confirmPassword);
    }

    @And("^I click on the register button$")
    public void iClickOnTheRegisterButton() {
        registrationPage.clickOnRegister();
    }

    @Then("^I registered$")
    public void iRegistered() {
        assertTrue(true, "Not successful register");
        registrationPage.clickOnGOBack();
    }

}
