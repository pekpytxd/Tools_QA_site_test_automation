package com.demoqa.steps;

import com.demoqa.pages.CheckBoxPage;
import org.testng.Assert;

public class CheckBoxPageBL {

    CheckBoxPage checkBoxPage;

    CheckBoxPageBL() {
        checkBoxPage = new CheckBoxPage();
    }

    public CheckBoxPageBL clickHomeCheckBox() {
        checkBoxPage.getHomeCheckbox().click();
        return this;
    }

    public CheckBoxPageBL clickDesktopButtonCheckBox() {
        checkBoxPage.getHomeToogle().click();
        checkBoxPage.getDesktopCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickDocumentsCheckBox() {
        checkBoxPage.getHomeToogle().click();
        checkBoxPage.getDocumentsCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickDownloadsCheckBox() {
        checkBoxPage.getHomeToogle().click();
        checkBoxPage.getDownloadsCheckBox().click();
        return this;
    }

    public void verifyClickDocumentsAndDownloadsCheckBoxes() {
        String expected = "You have selected :\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Documents and Downloads check boxes!");
    }

    public void verifyClickDesktopAndDownloadsCheckBoxes() {
        String expected = "You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Desktop and Downloads check boxes!");
    }

    public void verifyClickDesktopAndDocumentsCheckBoxes() {
        String expected = "You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Desktop and Documents check boxes!");
    }

    public void verifyClickDownloadsCheckBox() {
        String expected = "You have selected :\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Downloads check box!");
    }

    public void verifyClickDocumentsCheckBox() {
        String expected = "You have selected :\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Documents check box");
    }

    public void verifyClickDesktopButtonCheckBox() {
        String expected = "You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click desktop check box");
    }

    public void verifyClickHomeCheckBox() {
        String expected = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected, "You didn't choose anything");
    }
}
