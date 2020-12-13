package com.demoqa.steps;

import com.demoqa.pages.ElementsPage;

public class ElementsPageBL {

    ElementsPage elementsPage;

    ElementsPageBL() {
        elementsPage = new ElementsPage();
    }

    public TextBoxPageBL clickTextBoxPage() {
        elementsPage.getTextBoxButtonAndText().click();
        return new TextBoxPageBL();
    }

    public CheckBoxPageBL clickCheckBoxPage() {
        elementsPage.getCheckBoxButtonAndText().click();
        return new CheckBoxPageBL();
    }

    public RadioButtonPageBL clickRadioButtonPage() {
        elementsPage.getRadioButtonsButtonAndText().click();
        return new RadioButtonPageBL();
    }

}
