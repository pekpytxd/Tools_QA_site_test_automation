package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'Text Box')]")
    WebElement textBoxButtonAndText;

    @FindBy(xpath = "//span[contains(text(), 'Check Box')]")
    WebElement checkBoxButtonAndText;

    @FindBy(xpath = "//span[contains(text(), 'Radio Button')]")
    WebElement radioButtonsButtonAndText;

    @FindBy(xpath = "//span[contains(text(), 'Web Tables')]")
    WebElement webTablesButtonAndText;

    @FindBy(xpath = "//span[contains(text(), 'Buttons')]")
    WebElement buttonsButtonAndText;

    @FindBy(xpath = "//span[contains(text(), 'Links')]")
    WebElement linksButtonAndText;

    @FindBy(xpath = "//span[contains(text(), 'Broken Links') ]")
    WebElement brokenLinksButtonAndText;

    @FindBy(xpath = "//span[contains(text(), 'Upload and Download') ]")
    WebElement uploadAndDownloadButtonAndText;

    @FindBy(xpath = "//span[contains(text(), 'Dynamic Properties') ]")
    WebElement dynamicPropertiesButtonAndText;

    public WebElement getWebTablesButtonAndText() {
        return webTablesButtonAndText;
    }

    public WebElement getUploadAndDownloadButtonAndText() {
        return uploadAndDownloadButtonAndText;
    }

    public WebElement getRadioButtonsButtonAndText() {
        return radioButtonsButtonAndText;
    }

    public WebElement getLinksButtonAndText() {
        return linksButtonAndText;
    }

    public WebElement getDynamicPropertiesButtonAndText() {
        return dynamicPropertiesButtonAndText;
    }

    public WebElement getCheckBoxButtonAndText() {
        return checkBoxButtonAndText;
    }

    public WebElement getButtonsButtonAndText() {
        return buttonsButtonAndText;
    }

    public WebElement getBrokenLinksButtonAndText() {
        return brokenLinksButtonAndText;
    }

    public WebElement getTextBoxButtonAndText() {
        return textBoxButtonAndText;
    }
}
