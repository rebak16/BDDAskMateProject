package com.qa.stepDefinitions;

import com.qa.pages.MainNavBar;
import com.qa.pages.SearchPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class SearchTest {

    private MainNavBar mainNavBar = new MainNavBar();
    private SearchPage searchPage = new SearchPage();

    @When("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String search) {
        mainNavBar.clickOnSearchButton(search);
    }

    @Then("^I see the \"([^\"]*)\"$")
    public void iSeeThe(String errorMessage) {
        assertTrue(searchPage.seeSearchResult(), errorMessage);
    }
}
