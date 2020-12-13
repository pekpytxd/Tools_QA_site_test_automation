package com.demoqa.tests.elements;

import com.demoqa.navigation.Navigation;
import com.demoqa.steps.MainPageBL;
import com.demoqa.tests.BaseTest;
import org.testng.annotations.Test;

import static com.demoqa.enums.URLs.BASE_URL;

public class CheckBoxTest extends BaseTest {

    @Test
    public void clickHomeCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickHomeCheckBox()
                .verifyClickHomeCheckBox();
    }

    @Test
    public void clickDesktopCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickDesktopButtonCheckBox()
                .verifyClickDesktopButtonCheckBox();
    }

    @Test
    public void clickDocumentsCheckBoxText() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickDocumentsCheckBox()
                .verifyClickDocumentsCheckBox();
    }

    @Test
    public void clickDownloadsCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickDownloadsCheckBox()
                .verifyClickDownloadsCheckBox();
    }

    @Test
    public void clickDesktopAndDocumentsCheckBoxesTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickDesktopButtonCheckBox()
                .clickDocumentsCheckBox()
                .verifyClickDesktopAndDocumentsCheckBoxes();
    }

    @Test
    public void clickDesktopAndDownloadsCheckBoxesTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickDesktopButtonCheckBox()
                .clickDownloadsCheckBox()
                .verifyClickDesktopAndDownloadsCheckBoxes();
    }

    @Test
    public void clickDocumentsAndDownloadsCheckBoxesTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickDocumentsCheckBox()
                .clickDownloadsCheckBox()
                .verifyClickDocumentsAndDownloadsCheckBoxes();
    }

    @Test
    public void clickNotesCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickNotesCheckBox()
                .verifyClickNotesCheckBox();
    }

    @Test
    public void clickCommandsCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickCommandsCheckBox()
                .verifyClickCommandsCheckBox();
    }

    @Test
    public void clickWorkSpaceCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickWorkSpaceCheckBox()
                .verifyClickWorkSpaceCheckBox();
    }

    @Test
    public void clickOfficeCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickOfficeCheckBox()
                .verifyClickOfficeCheckBox();
    }

    @Test
    public void clickReactCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickReactCheckBox()
                .verifyClickReactCheckBox();
    }

    @Test
    public void clickAngularCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickAngularCheckBox()
                .verifyClickAngularCheckBox();
    }

    @Test
    public void clickVeuCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickVeuCheckBox()
                .verifyClickVeuCheckBox();
    }

    @Test
    public void clickPublicCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickPublicCheckBox()
                .verifyClickPublicCheckBox();
    }

    @Test
    public void clickPrivateCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickPrivateCheckBox()
                .verifyClickPrivateCheckBox();
    }

    @Test
    public void clickClassifiedCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickClassifiedCheckBox()
                .verifyClickClassifiedCheckBox();
    }

    @Test
    public void clickGeneralCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickGeneralCheckBox()
                .verifyClickGeneralCheckBox();
    }

    @Test
    public void clickWordFileCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickWordFileCheckBox()
                .verifyClickWordFileCheckBox();
    }

    @Test
    public void clickExcelFileCheckBoxTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickCheckBoxPage()
                .clickExcelFileCheckBox()
                .verifyClickExcelFileCheckBox();
    }
}
