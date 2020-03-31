package com.qa.stepDefinitions;

import com.qa.pages.LoginPage;
import com.qa.pages.MainNavBar;
import com.qa.pages.NewAnswerPage;
import com.qa.pages.QuestionPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class AnswerTest {

    private QuestionPage questionPage = new QuestionPage();
    private NewAnswerPage newAnswerPage = new NewAnswerPage();
    private LoginPage loginPage = new LoginPage();
    private MainNavBar mainNavBar = new MainNavBar();


    @When("^I click on a specified question$")
    public void I_click_on_a_specified_question() {
        loginPage.loginWithValidData();
        mainNavBar.clickOnQuestion();
    }

    @And("^I click on add new answer$")
    public void I_click_on_add_new_answer() {
        questionPage.addNewAnswer();
    }


    @And("^I fill the \"([^\"]*)\"$")
    public void iFillThe(String titleField) {
        newAnswerPage.fillTitleField(titleField);
    }

    @And("^I click on add new answer to finish$")
    public void I_click_on_add_new_answer_to_finish() {
        newAnswerPage.addNewAnswer();
    }

    @And("^I saved a new answer$")
    public void I_saved_a_new_answer() {
        assertTrue(questionPage.checkAnswer(), "Not successful");
    }

    @Then("^I delete the new answer$")
    public void I_delete_the_new_answer() {
        questionPage.deleteAnswer();
        questionPage.goBack();
    }
}
