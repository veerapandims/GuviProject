package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.DriverFactory;
import org.testng.Assert;

public class LoginSteps {
    private LoginPage login = new LoginPage(DriverFactory.getDriver());

    @Given("user is on the login page")
    public void user_on_login_page() {
        login.open(System.getProperty("app.url", "https://thinking-tester-contact-list.herokuapp.com/"));
    }

    @When("user enters valid email {string} and password {string}")
    public void user_enters_credentials(String email, String password) {
        login.enterEmail(email);
        login.enterPassword(password);
    }

    @When("clicks login")
    public void clicks_login() {
        login.clickLogin();
    }

    @Then("user should be redirected to the contact list page")
    public void redirected_to_contact_list() {
        Assert.assertTrue(new pages.ContactListPage(DriverFactory.getDriver()).isAt());
    }

    @Then("error message {string} should be displayed")
    public void error_message_should_be_displayed(String expected) {
        // Simple example: check page source contains text
        String source = DriverFactory.getDriver().getPageSource();
        Assert.assertTrue(source.contains(expected), "Expected error message not found.");
    }
}
