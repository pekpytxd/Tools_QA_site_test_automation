package com.demoqa.tests.elements;

import com.demoqa.datamodel.TextBoxModel;
import com.demoqa.navigation.Navigation;
import com.demoqa.pages.MainPage;
import com.demoqa.pages.TextBoxPage;
import com.demoqa.repository.TextBoxModelRepository;
import com.demoqa.steps.MainPageBL;
import com.demoqa.tests.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.demoqa.enums.URLs.BASE_URL;

public class TextBoxTest extends BaseTest {

    @Test
    public void inputDataTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        TextBoxModel textBoxModel = TextBoxModelRepository.getTextBoxModelWithAllData();
        mainPageBL.getElementsPage()
                .clickTextBoxPage()
                .inputTextBoxData(textBoxModel)
                .clickSubmitButton()
                .verifyInputAllData();
    }

    @Test
    public void inputDataWithoutNameTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        TextBoxModel textBoxModel = TextBoxModelRepository.getTextBoxModelWithoutName();
        mainPageBL.getElementsPage()
                .clickTextBoxPage()
                .inputTextBoxData(textBoxModel)
                .clickSubmitButton()
                .verifyInputWithoutName();
    }

    @Test
    public void inputDataWithoutEmailTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        TextBoxModel textBoxModel = TextBoxModelRepository.getTextBoxModelWithoutEmail();
        mainPageBL.getElementsPage()
                .clickTextBoxPage()
                .inputTextBoxData(textBoxModel)
                .clickSubmitButton()
                .verifyInputWithoutEmail();
    }

    @Test
    public void inputDataWithoutPermanentAddressTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        TextBoxModel textBoxModel = TextBoxModelRepository.getTextBoxModelWithoutPermanentAddress();
        mainPageBL.getElementsPage()
                .clickTextBoxPage()
                .inputTextBoxData(textBoxModel)
                .clickSubmitButton()
                .verifyInputWithoutPermanentAddress();
    }

    @Test
    public void inputDataWithoutCurrentAddressTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        TextBoxModel textBoxModel = TextBoxModelRepository.getTextBoxModelWithoutCurrentAddress();
        mainPageBL.getElementsPage()
                .clickTextBoxPage()
                .inputTextBoxData(textBoxModel)
                .clickSubmitButton()
                .verifyInputWithoutCurrentAddress();
    }

    @Test
    public void inputEmptyDataTest() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getElementsPage()
                .clickTextBoxPage()
                .clickSubmitButton()
                .verifyInputWithEmptyData();
    }
}
