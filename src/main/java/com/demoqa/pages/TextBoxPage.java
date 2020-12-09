package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {

    @FindBy(id = "userName")
    private WebElement inputUserNameField;

    @FindBy(id = "userEmail")
    private WebElement inputEmailField;

    @FindBy(id = "currentAddress")
    private WebElement inputCurrentAddressField;

    @FindBy(id = "permanentAddress")
    private WebElement inputPermanentAddressField;

    public WebElement getInputCurrentAddressField() {
        return inputCurrentAddressField;
    }

    public WebElement getInputEmailField() {
        return inputEmailField;
    }

    public WebElement getInputPermanentAddressField() {
        return inputPermanentAddressField;
    }

    public WebElement getInputUserNameField() {
        return inputUserNameField;
    }
}
