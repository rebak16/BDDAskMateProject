package com.qa.stepDefinitions;

import com.qa.pages.*;
import com.qa.util.WebDriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionTest {

    private MainNavBar mainNavBar = new MainNavBar();
    private QuestionPage questionPage = new QuestionPage();
    private LoginPage loginPage = new LoginPage();
    private EditQuestionPage editQuestionPage = new EditQuestionPage();
    private CommentPage commentPage = new CommentPage();
    private NewQuestionPage newQuestionPage = new NewQuestionPage();


    @BeforeEach
    public void setup(){
        loginPage.navigate();
        loginPage.loginWithValidData();
    }

    @Then("^I see the loaded details of the question$")
    public void I_see_the_loaded_details_of_the_question() {
        assertEquals("Drawing canvas with an image picked with Cordova Camera Plugin", questionPage.checkQuestion());
    }

    @When("^I click on edit question$")
    public void I_click_on_edit_question() {
        loginPage.loginWithValidData();
        questionPage.editQuestion();
    }

    @And("^I fill the title \"([^\"]*)\"$")
    public void I_fill_the_title(String titleOfEditQuestion) {
        editQuestionPage.fillTitleField(titleOfEditQuestion);
    }

    @And("^I click on edit new question$")
    public void I_click_on_edit_new_question() {
        editQuestionPage.editNewQuestion();
    }

    @And("^I click on edit question again$")
    public void I_click_on_edit_question_again() {
        questionPage.editQuestion();
    }

    @And("^I delete from title field$")
    public void I_delete_from_title_field() {
        editQuestionPage.deleteFromTitleField();
    }

    @And("^I edited the new question$")
    public void I_edited_the_new_question() {
        editQuestionPage.editNewQuestion();
    }

    @Then("^I check the \"([^\"]*)\"$")
    public void iCheckThe(String checkQuestion) {
        assertEquals(checkQuestion, questionPage.checkQuestion());
    }

    @And("^I click on comment$")
    public void iClickOnComment() {
        loginPage.loginWithValidData();
        questionPage.comment();
    }

    @And("^I click on add new comment$")
    public void iClickOnAddNewComment() {
        commentPage.addNewComment();
    }

    @Then("^I check the comment$")
    public void iCheckTheComment() {
        assertTrue(commentPage.checkComment(), "Missing feature");
    }


    @When("^I click on add new question$")
    public void iClickOnAddNewQuestion() {
        loginPage.loginWithValidData();
        mainNavBar.addNewQuestion();
    }

    @And("^I fill the message \"([^\"]*)\"$")
    public void iFillTheMessage(String messageField) {
        newQuestionPage.fillMessageField(messageField);
    }

    @And("^I click on add new question to finish$")
    public void iClickOnAddNewQuestionToFinish() {
        newQuestionPage.addNewQuestion();
    }

    @And("^I check the new question$")
    public void iCheckTheNewQuestion() {
        assertTrue(newQuestionPage.checkNewQuestion());
    }

    @And("^I go back to homepage$")
    public void iGoBackToHomepage() {
        questionPage.goBack();
    }

    @Then("^I delete the new question$")
    public void iDeleteTheNewQuestion() {
        mainNavBar.delete();
    }
}
