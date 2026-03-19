package com.utilities.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility {

    private WebDriver driver;
    private final Actions actions;

    public ActionsUtility(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void dragAndDropBy(WebElement source, int x, int y) {
        actions.dragAndDropBy(source, x, y).perform();
    }

    public void sendKeys(WebElement element, CharSequence keys) {
        actions.sendKeys(element, keys).perform();
    }

    public void click(WebElement element) {
        actions.moveToElement(element).click().perform();
    }

    public void doubleClick(WebElement element) {
        actions.doubleClick(element).perform();
    }

    public void rightClick(WebElement element) {
        actions.contextClick(element).perform();
    }

    public void hover(WebElement element) {
        actions.moveToElement(element).perform();
    }

    public void clickAndHold(WebElement element) {
        actions.clickAndHold(element).perform();
    }

    public void release(WebElement element) {
        actions.release(element).perform();
    }
}