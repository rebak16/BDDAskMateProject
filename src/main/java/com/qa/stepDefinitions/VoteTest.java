package com.qa.stepDefinitions;

import com.qa.pages.LoginPage;
import com.qa.pages.MainNavBar;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.jupiter.api.Assertions.*;

public class VoteTest {

    private LoginPage loginPage = new LoginPage();
    private MainNavBar mainNavBar = new MainNavBar();


    @When("^I click on vote up$")
    public void I_click_on_vote_up() {
        loginPage.loginWithValidData();
        mainNavBar.voteUp();
    }

    @And("^I click on vote down$")
    public void I_click_on_vote_down() {
        mainNavBar.voteDown();
    }

    @Then("^It will increase and decrease$")
    public void It_will_increase_and_decrease() {
        assertTrue(mainNavBar.checkVote());
    }
}
