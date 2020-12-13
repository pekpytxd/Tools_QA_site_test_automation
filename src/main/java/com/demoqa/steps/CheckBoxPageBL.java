package com.demoqa.steps;

import com.demoqa.pages.CheckBoxPage;
import org.testng.Assert;

public class CheckBoxPageBL {

    CheckBoxPage checkBoxPage;

    CheckBoxPageBL() {
        checkBoxPage = new CheckBoxPage();
    }

    private CheckBoxPageBL clickWorkSpaceToogle() {
        checkBoxPage.getHomeToogle().click();
        checkBoxPage.getDocumentsToogle().click();
        checkBoxPage.getWorkSpaceToogle().click();
        return this;
    }

    private CheckBoxPageBL clickHomeToogle() {
        checkBoxPage.getHomeToogle().click();
        return this;
    }

    private CheckBoxPageBL clickDesktopToogle() {
        clickHomeToogle();
        checkBoxPage.getDesktopToogle().click();
        return this;
    }

    private CheckBoxPageBL clickDocumentsToogle() {
        clickHomeToogle();
        checkBoxPage.getDocumentsToogle().click();
        return this;
    }

    private CheckBoxPageBL clickOfficeToogle() {
        clickHomeToogle();
        clickDocumentsToogle();
        checkBoxPage.getOfficeToogle().click();
        return this;
    }

    private CheckBoxPageBL clickDownloadsToogle() {
        clickHomeToogle();
        checkBoxPage.getDownloadsToogle().click();
        return this;
    }

    public CheckBoxPageBL clickWordFileCheckBox() {
        clickDownloadsToogle();
        checkBoxPage.getWordFileCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickExcelFileCheckBox() {
        clickDownloadsToogle();
        checkBoxPage.getExcelFileCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickPublicCheckBox() {
        clickOfficeToogle();
        checkBoxPage.getPublicCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickPrivateCheckBox() {
        clickOfficeToogle();
        checkBoxPage.getPrivateCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickClassifiedCheckBox() {
        clickOfficeToogle();
        checkBoxPage.getClassifiedCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickGeneralCheckBox() {
        clickOfficeToogle();
        checkBoxPage.getGeneralCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickHomeCheckBox() {
        checkBoxPage.getHomeCheckbox().click();
        return this;
    }

    public CheckBoxPageBL clickDesktopButtonCheckBox() {
        clickHomeToogle();
        checkBoxPage.getDesktopCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickDocumentsCheckBox() {
        clickHomeToogle();
        checkBoxPage.getDocumentsCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickDownloadsCheckBox() {
        clickHomeToogle();
        checkBoxPage.getDownloadsCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickNotesCheckBox() {
        clickHomeToogle();
        clickDesktopToogle();
        checkBoxPage.getNotesCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickCommandsCheckBox() {
        clickHomeToogle();
        clickDesktopToogle();
        checkBoxPage.getCommandsCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickWorkSpaceCheckBox() {
        clickHomeToogle();
        clickDocumentsToogle();
        checkBoxPage.getWorkSpaceCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickOfficeCheckBox() {
        clickHomeToogle();
        clickDocumentsToogle();
        checkBoxPage.getOfficeCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickReactCheckBox() {
        clickWorkSpaceToogle();
        checkBoxPage.getReactCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickAngularCheckBox() {
        clickWorkSpaceToogle();
        checkBoxPage.getAngularCheckBox().click();
        return this;
    }

    public CheckBoxPageBL clickVeuCheckBox() {
        clickWorkSpaceToogle();
        checkBoxPage.getVeuCheckBox().click();
        return this;
    }

    public void verifyClickWordFileCheckBox() {
        String expected = "You have selected :\n" +
                "wordFile";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Word File check box!");
    }

    public void verifyClickExcelFileCheckBox() {
        String expected = "You have selected :\n" +
                "excelFile";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Excel Fule check box!");
    }

    public void verifyClickPublicCheckBox() {
        String expected = "You have selected :\n" +
                "public";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Public check box!");
    }

    public void verifyClickPrivateCheckBox() {
        String expected = "You have selected :\n" +
                "private";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Private check box!");
    }

    public void verifyClickClassifiedCheckBox() {
        String expected = "You have selected :\n" +
                "classified";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Classified check box!");
    }

    public void verifyClickGeneralCheckBox() {
        String expected = "You have selected :\n" +
                "general";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click General check box!");
    }

    public void verifyClickReactCheckBox() {
        String expected = "You have selected :\n" +
                "react";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click React check box");
    }

    public void verifyClickAngularCheckBox() {
        String expected = "You have selected :\n" +
                "angular";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Angular check box!");
    }

    public void verifyClickVeuCheckBox() {
        String expected = "You have selected :\n" +
                "veu";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Veu check box!");
    }

    public void verifyClickWorkSpaceCheckBox() {
        String expected = "You have selected :\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click WorkSpace check box!");
    }

    public void verifyClickOfficeCheckBox() {
        String expected = "You have selected :\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Office check box!");
    }

    public void verifyClickNotesCheckBox() {
        String expected = "You have selected :\n" +
                "notes";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Notes check box!");
    }

    public void verifyClickCommandsCheckBox() {
        String expected = "You have selected :\n" +
                "commands";
        Assert.assertEquals(checkBoxPage.getDisplayResult().getText(), expected,
                "You didn't click Commands check box!");
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
