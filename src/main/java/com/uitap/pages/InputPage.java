package com.uitap.pages;

import com.uitap.base.BasePage;
import com.utilities.Actions.ActionsUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

public class InputPage extends BasePage {
    public InputPage(WebDriver driver){
        super(driver);
    }
    By inputField = By.id("newButtonName");
    By updateButton = By.id("updatingButton");
    public void setInputField(String text){
        actions.sendKeys(find(inputField),text);
    }
    public void clickUpdateButton(){
        click(updateButton);
    }
    public String getButtonText(){
        return find(updateButton).getText();
    }
}
