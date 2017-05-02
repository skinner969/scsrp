package by.framework.test.step;

import by.framework.test.page.LoginPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static com.codeborne.selenide.Condition.text;
import static org.junit.Assert.assertTrue;

/**
 * Created by skinner on 01.05.2017.
 */
public class LoginStep extends AbstractStep{

    @Autowired
    LoginPage loginPage;

    @Given("^I navigated to the Gmail page$")
    public void iNavigatedToTheGmailPage() {
        loginPage.openGmailPage();
    }

    @When("^I login with the following values:$")
    public void iLoginWithTheFollowingValues(DataTable table) {
        SelenideElement loginTextField = loginPage.getLoginTextField();
        loginTextField.val(table.raw().get(1).get(0));
        loginTextField.pressEnter();
    }

    @Then("^I should see \"([^\"]*)\" validation message$")
    public void iShouldSeeValidationMessage(String validationMessage) {
        loginPage.getValidationLabel().shouldHave(text(validationMessage));
    }
}
