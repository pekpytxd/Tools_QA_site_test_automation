package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckBoxPage extends BasePage{

    @FindBy(xpath = "//span[contains(text(), 'Home')]")
    private WebElement homeCheckbox;

    @FindBy(css = ".rct-icon.rct-icon-expand-close")
    private WebElement homeToogle;

    @FindBy(css = ".rct-node-collapsed:nth-child(1)")
    private WebElement desktopToogle;

    @FindBy(css = ".rct-node-collapsed:nth-child(2)")
    private WebElement documentsToogle;

    @FindBy(css = ".rct-node-collapsed:nth-child(3)")
    private WebElement downloadsToogle;

    @FindBy(css = "#tree-node-desktop + span")
    private WebElement desktopCheckBox;

    @FindBy(css = "#tree-node-documents + span")
    private WebElement documentsCheckBox;

    @FindBy(css = "#tree-node-downloads + span")
    private WebElement downloadsCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'Notes')]")
    private WebElement notesCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'Commands')]")
    private WebElement commandsCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'WorkSpace')]")
    private WebElement workSpaceCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'Office')]")
    private WebElement officeCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'React')]")
    private WebElement reactCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'Angular')]")
    private WebElement angularCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'Veu')]")
    private WebElement vueCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'Public')]")
    private WebElement publicCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'Private')]")
    private WebElement privateCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'Classified')]")
    private WebElement classifiedCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'General')]")
    private WebElement generalCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'Word File.doc')]")
    private WebElement wordFileCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'Excel')]")
    private WebElement excelFileCheckBox;

    @FindBy(id = "result")
    private WebElement displayResult;

    public WebElement getDisplayResult() {
        wait.until(ExpectedConditions.visibilityOf(displayResult));
        return displayResult;
    }

    public WebElement getAngularCheckBox() {
        return angularCheckBox;
    }

    public WebElement getClassifiedCheckBox() {
        return classifiedCheckBox;
    }

    public WebElement getCommandsCheckBox() {
        return commandsCheckBox;
    }

    public WebElement getDesktopCheckBox() {
        return desktopCheckBox;
    }

    public WebElement getDesktopToogle() {
        return desktopToogle;
    }

    public WebElement getDocumentsCheckBox() {
        return documentsCheckBox;
    }

    public WebElement getDocumentsToogle() {
        return documentsToogle;
    }

    public WebElement getDownloadsCheckBox() {
        return downloadsCheckBox;
    }

    public WebElement getDownloadsToogle() {
        return downloadsToogle;
    }

    public WebElement getExcelFileCheckBox() {
        return excelFileCheckBox;
    }

    public WebElement getGeneralCheckBox() {
        return generalCheckBox;
    }

    public WebElement getHomeCheckbox() {
        return homeCheckbox;
    }

    public WebElement getHomeToogle() {
        return homeToogle;
    }

    public WebElement getNotesCheckBox() {
        return notesCheckBox;
    }

    public WebElement getOfficeCheckBox() {
        return officeCheckBox;
    }

    public WebElement getPrivateCheckBox() {
        return privateCheckBox;
    }

    public WebElement getPublicCheckBox() {
        return publicCheckBox;
    }

    public WebElement getReactCheckBox() {
        return reactCheckBox;
    }

    public WebElement getVueCheckBox() {
        return vueCheckBox;
    }

    public WebElement getWordFileCheckBox() {
        return wordFileCheckBox;
    }

    public WebElement getWorkSpaceCheckBox() {
        return workSpaceCheckBox;
    }
}
