package com.co.choucair.tasks;

import com.co.choucair.models.BusinessUnitData;
import com.co.choucair.userinterfaces.CreateBusinessUnitPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CreateBusinessUnit implements Task {

    private BusinessUnitData businessUnitData;

    public CreateBusinessUnit(BusinessUnitData businessUnitData) {
        this.businessUnitData = businessUnitData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreateBusinessUnitPage.BTN_NEW_BUSINESS_UNIT),
                Enter.theValue(businessUnitData.getName()).into(CreateBusinessUnitPage.INPUT_NAME),
                Click.on(CreateBusinessUnitPage.BTN_SAVE)
        );
    }

    public static CreateBusinessUnit withData(BusinessUnitData businessUnitData){
        return Instrumented.instanceOf(CreateBusinessUnit.class).withProperties(businessUnitData);
    }
}
