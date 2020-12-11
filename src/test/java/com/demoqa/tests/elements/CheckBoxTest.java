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
}
