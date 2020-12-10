package com.demoqa.steps;

import com.demoqa.datamodel.TextBoxModel;
import com.demoqa.pages.TextBoxPage;
import org.testng.Assert;

public class TextBoxPageBL {

    TextBoxPage textBoxPage;

    TextBoxPageBL() {
        textBoxPage = new TextBoxPage();
    }

    public TextBoxPageBL inputTextBoxData(TextBoxModel textBoxModel) {
        inputFullName(textBoxModel.getFullName());
        inputEmail(textBoxModel.getEmail());
        inputCurrentAddress(textBoxModel.getCurrentAddress());
        inputPermanentAddress(textBoxModel.getPermanentAddress());

        return this;
    }

    public void verifyInputWithoutName() {
        String expected = "Email:name@gmail.com\n" +
                "Current Address :current address\n" +
                "Permananet Address :permanent address";
        Assert.assertEquals(textBoxPage.getInputData().getText(), expected, "You entered name or nothing!");
    }

    public void verifyInputWithoutEmail() {
        String expected = "Name:name\n" +
                "Current Address :current address\n" +
                "Permananet Address :permanent address";
        Assert.assertEquals(textBoxPage.getInputData().getText(), expected, "You entered email or nothing!");
    }

    public void verifyInputWithoutPermanentAddress() {
        String expected = "Name:name\n" +
                "Email:name@gmail.com\n" +
                "Current Address :current address";
        Assert.assertEquals(textBoxPage.getInputData().getText(), expected,
                "You entered permanent address or nothing");
    }

    public void verifyInputWithoutCurrentAddress() {
        String expected = "Name:name\n" +
                "Email:name@gmail.com\n" +
                "Permananet Address :permanent address";
        Assert.assertEquals(textBoxPage.getInputData().getText(), expected,
                "You entered current address or nothing");
    }

    public void verifyInputWithEmptyData() {
        String expected = "";
        Assert.assertEquals(textBoxPage.getInputData().getText(), expected, "You entered something!");
    }

    public void verifyInputAllData() {
        String expected = "Name:name\n" +
                "Email:name@gmail.com\n" +
                "Current Address :current address\n" +
                "Permananet Address :permanent address";
        Assert.assertEquals(textBoxPage.getInputData().getText(), expected, "You didn't enter anything!");
    }

    public TextBoxPageBL clickSubmitButton() {
        textBoxPage.getSubmitButton().click();
        return this;
    }

    private void inputFullName(String fullName) {
        textBoxPage.getInputUserNameField().clear();
        textBoxPage.getInputUserNameField().sendKeys(fullName);
    }

    private void inputEmail(String email) {
        textBoxPage.getInputEmailField().clear();
        textBoxPage.getInputEmailField().sendKeys(email);
    }

    private void inputCurrentAddress(String currentAddress) {
        textBoxPage.getInputCurrentAddressField().clear();
        textBoxPage.getInputCurrentAddressField().sendKeys(currentAddress);
    }

    private void inputPermanentAddress(String permanentAddress) {
        textBoxPage.getInputPermanentAddressField().clear();
        textBoxPage.getInputPermanentAddressField().sendKeys(permanentAddress);
    }
}
