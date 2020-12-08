package com.demoqa.util;

import com.demoqa.driver.DriverRepository;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DriverUtils {

    private WebDriver driver;

    public DriverUtils() {
        driver = DriverRepository.DRIVERS.get();
    }

    private JavascriptExecutor getJSExecutor() {
        return (JavascriptExecutor) driver;
    }
}
