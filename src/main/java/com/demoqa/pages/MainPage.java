package com.demoqa.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class MainPage extends BasePage {

    @FindBy(css = ".mt-4:nth-child(1)")
    private WebElement elementsButton;

    @FindBy(css = ".mt-4:nth-child(2)")
    private WebElement formsButton;

    @FindBy(css = ".mt-4:nth-child(3)")
    private WebElement alertsFrameWindowsButton;

    @FindBy(css = ".mt-4:nth-child(4)")
    private WebElement widgetsButton;

    @FindBy(css = ".mt-4:nth-child(5)")
    private WebElement interactionsButton;

    @FindBy(css = ".mt-4:nth-child(6)")
    private WebElement bookStoreApplicationButton;

    public WebElement getAlertsFrameWindowsButton() {
        return alertsFrameWindowsButton;
    }

    public WebElement getBookStoreApplicationButton() {
        return bookStoreApplicationButton;
    }

    public WebElement getFormsButton() {
        return formsButton;
    }

    public WebElement getInteractionsButton() {
        return interactionsButton;
    }

    public WebElement getWidgetsButton() {
        return widgetsButton;
    }

    public WebElement getElementsButton() {
        return elementsButton;
    }
}
