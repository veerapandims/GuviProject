package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.DriverFactory;
import org.testng.Assert;

public class RegisterSteps {
    private LoginPage login = new LoginPage(DriverFactory.getDriver());

    @Given("user is on the registration page")
    public void user_on_registration_page() {
        login.open(System.getProperty("app.url", "https://thinking-tester-contact-list.herokuapp.com/") + "register");
    }

    // Additional steps to be implemented...
}
