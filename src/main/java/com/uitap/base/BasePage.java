package com.uitap.base;

import com.utilities.Actions.ActionsUtility;
import com.utilities.Javascript.JavaScriptUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Duration defaultTimeout;
    protected ActionsUtility actions;
    protected JavaScriptUtility jsUtility;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.defaultTimeout = Duration.ofSeconds(15);
        this.wait = new WebDriverWait(driver, defaultTimeout);
        actions = new ActionsUtility(driver);
        jsUtility = new JavaScriptUtility(driver);
    }

    protected WebElement find(By locator) {
        return find(locator, defaultTimeout);
    }

    protected WebElement find(By locator, Duration timeout) {
        return new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void set(By locator, String text) {
        set(locator, text, defaultTimeout);
    }

    protected void set(By locator, String text, Duration timeout) {
        WebElement element = new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }

    protected void click(By locator) {
        click(locator, defaultTimeout);
    }

    protected void click(By locator, Duration timeout) {
        new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.elementToBeClickable(locator))
                .click();
    }
}
