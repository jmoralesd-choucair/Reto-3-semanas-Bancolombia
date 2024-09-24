package com.co.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import com.co.choucair.userinterfaces.MeetingsPage;

public class MeetingCreated implements Question<Boolean> {

    private final String meetingTitle;
    private final String businessUnit;

    public MeetingCreated(String meetingTitle, String businessUnit) {
        this.meetingTitle = meetingTitle;
        this.businessUnit = businessUnit;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return MeetingsPage.MEETING_ROW(meetingTitle, businessUnit).resolveFor(actor).isPresent();
    }

    public static MeetingCreated exists(String meetingTitle, String businessUnit){
        return new MeetingCreated(meetingTitle, businessUnit);
    }
}
