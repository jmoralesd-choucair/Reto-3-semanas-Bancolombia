package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.MeetingsPage;
import com.co.choucair.userinterfaces.StarSharpHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class NavigateToMeetings implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(StarSharpHomePage.MENU_REUNION),
                Click.on(StarSharpHomePage.SUBMENU_REUNIONES),
                WaitUntil.the(MeetingsPage.BTN_NEW_MEETING, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static NavigateToMeetings page(){
        return new NavigateToMeetings();
    }
}
