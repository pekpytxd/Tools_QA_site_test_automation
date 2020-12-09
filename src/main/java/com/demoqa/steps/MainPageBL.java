package com.demoqa.steps;

import com.demoqa.pages.MainPage;

public class MainPageBL {

    MainPage mainPage;

    public MainPageBL() {
        mainPage = new MainPage();
    }

    public TasksPageBL getTasksPage() {
        clickOnElementsButton();
        return new TasksPageBL();
    }

    private void clickOnElementsButton() {
        mainPage.getElementsButton().click();
    }
}
