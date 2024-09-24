package com.co.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class BusinessUnitInTable implements Question<Boolean> {

    private final String businessUnitName;
    private final Target targetElement;

    public BusinessUnitInTable(String businessUnitName, Target targetElement) {
        this.businessUnitName = businessUnitName;
        this.targetElement = targetElement;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String displayedText = targetElement.resolveFor(actor).getText();
        return displayedText.contains(businessUnitName);
    }

    public static BusinessUnitInTable withName(String businessUnitName, Target targetElement){
        return new BusinessUnitInTable(businessUnitName, targetElement);
    }
}
