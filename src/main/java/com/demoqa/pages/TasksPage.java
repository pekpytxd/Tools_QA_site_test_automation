package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage {

    @FindBy(css = ".main-header")
    WebElement headerOfPage;

    public WebElement getHeaderOfPage() {
        return headerOfPage;
    }
}
