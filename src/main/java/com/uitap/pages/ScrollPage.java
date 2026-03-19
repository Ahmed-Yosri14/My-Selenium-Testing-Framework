package com.uitap.pages;

import com.uitap.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScrollPage extends BasePage {
    public ScrollPage(WebDriver driver){
        super(driver);
    }
    By hidingButton = By.id("hidingButton");
    public void clickHidingButton() {
        jsUtility.scrollToElementJS(hidingButton);
        click(hidingButton);
    }
    public Boolean isHidingButtonVisible() {
        return find(hidingButton).isDisplayed();
    }
}
