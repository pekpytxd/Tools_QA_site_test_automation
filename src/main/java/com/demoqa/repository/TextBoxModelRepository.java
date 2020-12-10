package com.demoqa.repository;

import com.demoqa.datamodel.TextBoxModel;
import org.apache.commons.lang3.RandomStringUtils;

public class TextBoxModelRepository {

    private TextBoxModelRepository() {
    }

    public static TextBoxModel getTextBoxModelWithAllData() {
        return TextBoxModel.getBuilder()
                .fullName("name")
                .email("name" + "@gmail.com")
                .currentAddress("current address")
                .permanentAddress("permanent address")
                .build();
    }

    public static TextBoxModel getTextBoxModelWithoutName() {
        return TextBoxModel.getBuilder()
                .fullName("")
                .email("name" + "@gmail.com")
                .currentAddress("current address")
                .permanentAddress("permanent address")
                .build();
    }

    public static TextBoxModel getTextBoxModelWithoutEmail() {
        return TextBoxModel.getBuilder()
                .fullName("name")
                .email("")
                .currentAddress("current address")
                .permanentAddress("permanent address")
                .build();
    }

    public static TextBoxModel getTextBoxModelWithoutCurrentAddress() {
        return TextBoxModel.getBuilder()
                .fullName("name")
                .email("name" + "@gmail.com")
                .currentAddress("")
                .permanentAddress("permanent address")
                .build();
    }

    public static TextBoxModel getTextBoxModelWithoutPermanentAddress() {
        return TextBoxModel.getBuilder()
                .fullName("name")
                .email("name" + "@gmail.com")
                .currentAddress("current address")
                .permanentAddress("")
                .build();
    }
}
