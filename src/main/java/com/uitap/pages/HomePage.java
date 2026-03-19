package com.uitap.pages;

import com.uitap.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }
    By dynamicIdSection = By.xpath("//a[@href='/dynamicid']");
    By classAttributeSection = By.xpath("//a[@href='/classattr']");
    By delaySection = By.xpath("//a[@href='/loaddelay']");
    By ajaxSection = By.xpath("//a[@href='/ajax']");
    By clickSection = By.xpath("//a[@href='/click']");
    By inputSection = By.xpath("//a[@href='/textinput']");

    public DynamicIdPage clickDynamicIdSection(){
        click(dynamicIdSection);
        return new DynamicIdPage(driver);
    }
    public ClassPage clickClassAttributeSection(){
        click(classAttributeSection);
        return new ClassPage(driver);
    }

    public DelayPage clickDelaySection(){
        click(delaySection);
        return new DelayPage(driver);
    }
    public AJAXPage clickAjaxSection(){
        click(ajaxSection);
        return new AJAXPage(driver);
    }
    public ClickPage clickClickSection(){
        click(clickSection);
        return new ClickPage(driver);
    }
    public InputPage clickInputSection(){
        click(inputSection);
        return new InputPage(driver);
    }

}
