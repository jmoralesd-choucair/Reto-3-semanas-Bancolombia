package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.CreateBusinessUnitPage;
import com.co.choucair.userinterfaces.StarSharpHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateToBusinessUnit implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(StarSharpHomePage.PARENT_MENU_ORGANIZACION),
            Click.on(StarSharpHomePage.CHILD_MENU_ORGANIZACION_UNIDADES_NEGOCIO),
            WaitUntil.the(CreateBusinessUnitPage.BTN_NEW_BUSINESS_UNIT, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static NavigateToBusinessUnit page(){
        return new NavigateToBusinessUnit();
    }
}
