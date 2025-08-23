package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage {

    private By addContactButton = By.xpath("//a[contains(text(),'Add Contact') or contains(@href,'add')]");

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        return driver.getTitle().toLowerCase().contains("contact");
    }

    public void clickAddContact() {
        click(addContactButton);
    }
}
