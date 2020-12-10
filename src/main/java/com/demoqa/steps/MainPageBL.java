package com.demoqa.steps;

import com.demoqa.pages.MainPage;

public class MainPageBL {

    MainPage mainPage;

    public MainPageBL() {
        mainPage = new MainPage();
    }

    public ElementsPageBL getElementsPage() {
        clickOnElementsButton();
        return new ElementsPageBL();
    }

    private void clickOnElementsButton() {
        mainPage.getElementsButton().click();
    }
}
