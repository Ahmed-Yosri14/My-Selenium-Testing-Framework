package com.uitap.pages;

import com.uitap.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicIdPage extends BasePage {
    public DynamicIdPage(WebDriver driver){
        super(driver);
    }
    By dynamicButton = By.cssSelector(".btn-primary");
    public void clickDynamicButton() {
        click(dynamicButton);
    }
    public Boolean isDynamicButtonClicked(){
        return find(By.id("buttonClickedMessage")).isDisplayed();
    }
}
