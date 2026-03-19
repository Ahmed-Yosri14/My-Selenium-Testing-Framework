package com.uitap.pages;

import com.uitap.base.BasePage;
import com.utilities.Actions.ActionsUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickPage extends BasePage {
    public ClickPage(WebDriver driver){
        super(driver);
    }
    By beforeClickButton = By.className("btn-primary");
    By afterClickButton = By.className("btn-success");
    public void clickButton(){
        actions.click(find(beforeClickButton));
    }
    public Boolean isButtonClicked(){
        return find(afterClickButton).isDisplayed();
    }
}
