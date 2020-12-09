package com.demoqa.steps;

import com.demoqa.pages.ElementsPage;

public class ElementsPageBL {

    ElementsPage elementsPage;

    ElementsPageBL() {
        elementsPage = new ElementsPage();
    }

    private TextBoxPageBL clickTextBoxPage() {
        elementsPage.getTextBoxButtonAndText().click();
        return new TextBoxPageBL();
    }

}
