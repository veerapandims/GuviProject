package com.ecommerce.pages;

import com.ecommerce.core.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver driver;

    private final By loginLink = By.id("login2");
    private final By signUpLink = By.id("signin2");
    private final By cartLink = By.id("cartur");
    private final By logoutLink = By.id("logout2");
    private final By userLabel = By.id("nameofuser");
    private final By homeLink = By.xpath("//a[text()='Home ']");

    private final By phonesCat = By.xpath("//a[text()='Phones']");
    private final By laptopsCat = By.xpath("//a[text()='Laptops']");
    private final By monitorsCat = By.xpath("//a[text()='Monitors']");

    public HomePage(WebDriver driver) { this.driver = driver; }

    public void openLoginModal() { driver.findElement(loginLink).click(); }
    public void openSignupModal() { driver.findElement(signUpLink).click(); }
    public void goToCart() { driver.findElement(cartLink).click(); }
    public void clickHome() { driver.findElement(homeLink).click(); }

    public boolean isUserLoggedIn() {
        try {
            WebElement el = Waits.visible(driver, userLabel);
            return el.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void filterPhones() { driver.findElement(phonesCat).click(); }
    public void filterLaptops() { driver.findElement(laptopsCat).click(); }
    public void filterMonitors() { driver.findElement(monitorsCat).click(); }

    public void openProductByName(String name) {
        driver.findElement(By.linkText(name)).click();
    }
}
