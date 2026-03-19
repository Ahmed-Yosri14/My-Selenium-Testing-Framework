package com.uitap.pages;

import com.uitap.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DelayPage extends BasePage {
    public DelayPage(WebDriver driver){
        super(driver);
    }
    private By delayButton = By.cssSelector(".btn-primary");
    public Boolean isDelayButtonDisplayed() {
        return find(delayButton).isDisplayed();
    }

}
