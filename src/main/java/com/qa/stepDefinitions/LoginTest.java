package com.qa.stepDefinitions;

import com.qa.pages.LoginPage;
import com.qa.pages.MainNavBar;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginTest {

    private MainNavBar mainNavBar = new MainNavBar();
    private LoginPage loginPage = new LoginPage();


    @Given("^Open the Chrome and start application$")
    public void openTheChromeAndStartApplication() {
        loginPage.navigate();
        mainNavBar.clickLogoutButtonForLogin();
    }

    @When("^I click on the main log in button$")
    public void iClickOnTheMainLogInButton() {
        mainNavBar.clickLoginButton();
    }

    @And("^I fill the username field with \"([^\"]*)\"$")
    public void fillTheUsername(String username) {
        loginPage.clickOnUserName(username);
    }

    @And("^I fill the password field with \"([^\"]*)\"$")
    public void fillThePassword(String password) {
        loginPage.clickOnPassword(password);
    }

    @And("^I click on the log in button$")
    public void clickOnTheLoginButton() {
        loginPage.clickOnLogin();
    }

    @And("^I logged in$")
    public void loggedIn() {
        Assertions.assertTrue(mainNavBar.checkLogout(), "Not registered");
    }

    @Then("^I logged out$")
    public void iLoggedOut() {
        mainNavBar.clickLogoutButtonForLogin();
    }
}
