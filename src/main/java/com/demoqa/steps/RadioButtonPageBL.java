package com.demoqa.steps;

import com.demoqa.pages.RadioButtonPage;
import org.testng.Assert;

public class RadioButtonPageBL {

    RadioButtonPage radioButtonPage;

    RadioButtonPageBL() {
        radioButtonPage = new RadioButtonPage();
    }

    public RadioButtonPageBL clickYesRadioButton() {
        radioButtonPage.getYesRadioButton().click();
        return this;
    }

    public RadioButtonPageBL clickImpressiveRadioButton() {
        radioButtonPage.getImpressiveRadioButton().click();
        return this;
    }

    public void verifyClickYesRadioButton() {
        String expected = "You have selected Yes";
        Assert.assertEquals(radioButtonPage.getTextSuccess().getText(), expected,
                "You didn't click Yes Radio Button!");
    }

    public void verifyClickImpressiveRadioButton() {
        String expected = "You have selected Impressive";
        Assert.assertEquals(radioButtonPage.getTextSuccess().getText(), expected,
                "You didn't click Impressive Radio Button!");
    }
}
