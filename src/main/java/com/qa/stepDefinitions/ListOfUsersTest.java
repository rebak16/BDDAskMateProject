package com.qa.stepDefinitions;

import com.qa.pages.ListOfUsersPage;
import com.qa.pages.MainNavBar;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;


public class ListOfUsersTest {

    private MainNavBar mainNavBar = new MainNavBar();
    private ListOfUsersPage listOfUsersPage = new ListOfUsersPage();

    @When("^I click on list of users$")
    public void I_click_on_list_of_users() {
        mainNavBar.clickOnUsers();
    }

    @When("^Check the users$")
    public void Check_the_users() {
        assertTrue(listOfUsersPage.checkUser());
    }

    @Then("^I see the users$")
    public void I_see_the_users() {
    }
}
