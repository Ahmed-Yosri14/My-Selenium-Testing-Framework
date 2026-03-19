package com.uitap.pages;

import com.uitap.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassPage extends BasePage {
    public ClassPage(WebDriver driver) {
        super(driver);
    }

    By primaryButton = By.cssSelector(".btn-primary");
    public void clickPrimaryButton() {
        click(primaryButton);
    }

}
