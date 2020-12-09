package com.demoqa.datamodel;

public class TextBoxModel {

    private String email;
    private String password;
    private String currentAddress;
    private String permanentAddress;

    public static TextBoxModel.Builder getBuilder(String value) {
        return new TextBoxModel().new Builder();
    }

    public class Builder {
        public TextBoxModel.Builder email(String value) {
            email = value;
            return this;
        }

        public TextBoxModel.Builder password(String value) {
            password = value;
            return this;
        }

        public TextBoxModel.Builder currentAddress(String value) {
            currentAddress = value;
            return this;
        }

        public TextBoxModel.Builder permanentAddress(String value) {
            permanentAddress = value;
            return this;
        }

        public TextBoxModel build() {
            return TextBoxModel.this;
        }
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }
}
