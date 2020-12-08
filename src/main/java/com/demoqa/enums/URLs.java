package com.demoqa.enums;

public enum  URLs {
    BASE_URL ("https://demoqa.com/links");

    private String value;

    URLs (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
