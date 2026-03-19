package com.utilities.Switch;

import com.utilities.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility {


    public SwitchToUtility(WebDriver driver) {
        super(driver);
    }

    private WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public String getAlertText() {
        return switchTo().alert().getText();
    }

    public void acceptAlert() {
        switchTo().alert().accept();
    }

    public void dismissAlert() {
        switchTo().alert().dismiss();
    }

    public void setAlertText(String text) {
        switchTo().alert().sendKeys(text);
    }

    public void switchToFrame(String value) {
        switchTo().frame(value);
    }

    public void switchToDefaultContent() {
        switchTo().defaultContent();
    }

    public void switchToFrame(int index) {
        switchTo().frame(index);
    }

    public void switchToFrame(WebElement element) {
        switchTo().frame(element);
    }

    public void switchToWindow(String handle) {
        switchTo().window(handle);
    }
}