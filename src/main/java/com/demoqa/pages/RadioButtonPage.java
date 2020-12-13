package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage extends BasePage {

    @FindBy(css = "label[for='yesRadio']")
    private WebElement yesRadioButton;

    @FindBy(css = "label[for='impressiveRadio']")
    private WebElement impressiveRadioButton;

    @FindBy(css = ".mt-3")
    private WebElement textSuccess;

    public WebElement getTextSuccess() {
        return textSuccess;
    }

    public WebElement getImpressiveRadioButton() {
        return impressiveRadioButton;
    }

    public WebElement getYesRadioButton() {
        return yesRadioButton;
    }
}
