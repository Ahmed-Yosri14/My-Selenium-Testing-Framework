package com.uitap.pages;

import com.uitap.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AJAXPage extends BasePage {
    public AJAXPage (WebDriver driver){
        super(driver);
    }
    By button = By.id("ajaxButton");
    By message = By.className("bg-success");
    public void clickButton(){
        click(button);
    }
    public String getMessageText(){
        return find(message).getText();
    }

}
