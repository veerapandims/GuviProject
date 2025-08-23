package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//button[contains(text(),'Login')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open(String url) {
        driver.get(url);
    }

    public void enterEmail(String email) {
        type(emailField, email);
    }

    public void enterPassword(String password) {
        type(passwordField, password);
    }

    public void clickLogin() {
        click(loginButton);
    }
}
