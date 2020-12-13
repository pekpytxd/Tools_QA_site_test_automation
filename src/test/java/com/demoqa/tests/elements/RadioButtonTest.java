package com.demoqa.tests.elements;

import com.demoqa.navigation.Navigation;
import com.demoqa.steps.MainPageBL;
import com.demoqa.tests.BaseTest;
import org.testng.annotations.Test;

import static com.demoqa.enums.URLs.BASE_URL;

public class RadioButtonTest extends BaseTest {

    @Test
    public void clickYesRadioButtonTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickRadioButtonPage()
                .clickYesRadioButton()
                .verifyClickYesRadioButton();
    }

    @Test
    public void clickImpressiveRadioButtonTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickRadioButtonPage()
                .clickImpressiveRadioButton()
                .verifyClickImpressiveRadioButton();
    }
}