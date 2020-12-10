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

    @FindBy(css = ".col-md-12")
    private WebElement inputData;

    @FindBy(css = "#submit")
    private WebElement submitButton;

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getInputData() {
        return inputData;
    }

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
