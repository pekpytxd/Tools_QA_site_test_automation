package com.demoqa.pages;

import com.demoqa.driver.DriverRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        DriverRepository.DRIVERS.get();
        wait = new WebDriverWait(driver, 4);
        PageFactory.initElements(driver, this);
    }
}
