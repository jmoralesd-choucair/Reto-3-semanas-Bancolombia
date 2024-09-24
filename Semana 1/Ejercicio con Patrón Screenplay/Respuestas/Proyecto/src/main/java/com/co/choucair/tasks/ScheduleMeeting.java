package com.co.choucair.tasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.co.choucair.models.MeetingData;
import com.co.choucair.userinterfaces.MeetingsPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class ScheduleMeeting implements Task {

    private final MeetingData meetingData;


    public ScheduleMeeting(MeetingData meetingData) {
        this.meetingData = meetingData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(MeetingsPage.BTN_NEW_MEETING),

                Enter.theValue(meetingData.getTitle()).into(MeetingsPage.INPUT_MEETING_NAME),

                Enter.theValue(generateMeetingNumber()).into(MeetingsPage.INPUT_MEETING_NUMBER),
                Enter.theValue(getCurrentDateTime()).into(MeetingsPage.INPUT_START_DATE),
                Enter.theValue(getOneHourLaterDateTime()).into(MeetingsPage.INPUT_END_DATE),

                selectOptionFromDropdown(MeetingsPage.DROPDOWN_MEETING_TYPE, MeetingsPage.SELECT2_INPUT_TYPE, meetingData.getType()),
                selectOptionFromDropdown(MeetingsPage.DROPDOWN_LOCATION, MeetingsPage.SELECT2_INPUT_LOCATION, meetingData.getLocation()),
                selectOptionFromDropdown(MeetingsPage.DROPDOWN_UNIT, MeetingsPage.SELECT2_INPUT_UNIT, meetingData.getUnit()),
                selectOptionFromDropdown(MeetingsPage.DROPDOWN_ORGANIZER, MeetingsPage.SELECT2_INPUT_ORGANIZER, meetingData.getOrganizer()),
                selectOptionFromDropdown(MeetingsPage.DROPDOWN_REPORTER, MeetingsPage.SELECT2_INPUT_REPORTER, meetingData.getReporter()),

                addAttendees(),

                Click.on(MeetingsPage.BTN_SCHEDULE)
        );
    }

    private Performable selectOptionFromDropdown(Target dropdown, Target inputField, String option) {
        return Task.where("{0} selects " + option + " from dropdown",
                Click.on(dropdown),
                Enter.theValue(option).into(inputField),
                Hit.the(Keys.ENTER).into(inputField)
        );
    }


    private String generateMeetingNumber() {
        Random rand = new Random();
        int number = rand.nextInt(900) + 100;
        return String.valueOf(number);
    }

    private String getCurrentDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return LocalDateTime.now().plusDays(1).format(formatter);
    }

    private String getOneHourLaterDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return LocalDateTime.now().plusDays(1).plusHours(1).format(formatter);
    }

    private final Set<String> usedContacts = new HashSet<>();

    private static final List<String> CONTACTS = Arrays.asList(
            "Aaron Taylor",
            "Adam Edwards",
            "Adam Stewart",
            "Alexander Russell",
            "Alexandra James",
            "Alexis Lopez",
            "Allison Bell",
            "Amber Jenkins",
            "Andrew White",
            "Anna Simmons",
            "Anthony Howard",
            "Austin Miller",
            "Brandon Coleman",
            "Brandon Hughes",
            "Brandon Washington",
            "Brian Morgan",
            "Brianna Gonzales",
            "Charles Davis",
            "Charlotte Bell",
            "Charlotte Scott",
            "Christina Cook",
            "Christina White",
            "Christopher Brown",
            "Danielle Richardson",
            "Danielle Taylor",
            "Dylan Clark",
            "Dylan Smith",
            "Eleanor Hughes",
            "Eleanor Jenkins",
            "Eleanor Young",
            "Elizabeth Foster",
            "Emily Patterson",
            "Eric Butler",
            "Evelyn Parker",
            "Haley Griffin",
            "Haley Reed",
            "Haley White",
            "Hannah Robinson",
            "Henry Bennett",
            "Henry Peterson",
            "Isabella Griffin",
            "Isabella Lewis",
            "James Brooks",
            "James Jones",
            "Jasmine Sanders",
            "Jason Baker",
            "Jason Campbell",
            "Jason Cooper",
            "Jason Green",
            "Jennifer Collins",
            "John Brooks",
            "Jose Hayes",
            "Joseph Thompson",
            "Justin Washington",
            "Kaitlyn Long",
            "Kelsey Hall",
            "Kelsey Russell",
            "Kevin Ward",
            "Kyle Rivera",
            "Laura Jackson",
            "Lauren Simmons",
            "Layla Roberts",
            "Lillian Cooper",
            "Maria Cox",
            "Mark Russell",
            "Matthew Murphy",
            "Megan Jackson",
            "Megan Sanders",
            "Michael Reed",
            "Michael White",
            "Michelle Allen",
            "Natalie Russell",
            "Nathan Coleman",
            "Nicholas Garcia",
            "Nicole Coleman",
            "Nicole Martinez",
            "Olivia Patterson",
            "Olivia Reed",
            "Owen Bailey",
            "Owen Foster",
            "Patrick Evans",
            "Richard Williams",
            "Richard Young",
            "Robert Adams",
            "Robert Powell",
            "Samuel Adams",
            "Sara Torres",
            "Sarah Gonzales",
            "Sarah Long",
            "Sean Brown",
            "Stephanie Bell",
            "Stephen Diaz",
            "Stephen White",
            "Steven Lopez",
            "Thomas Butler",
            "Timothy Bryant",
            "Victoria Bailey",
            "Victoria Parker",
            "Victoria Wright",
            "Zachary Edwards"
    );

    private Performable addAttendees() {
        return Task.where("{0} adds attendees",
                actor -> {
                    List<String> availableContacts = new ArrayList<>(CONTACTS);
                    availableContacts.removeAll(usedContacts);
                    Random rand = new Random();
                    int attendeeCount = rand.nextInt(4) + 2;
                    for (int i = 0; i < attendeeCount; i++) {
                        if (availableContacts.isEmpty()) {
                            break;
                        }
                        String attendee = availableContacts.remove(rand.nextInt(availableContacts.size()));
                        usedContacts.add(attendee);
                        actor.attemptsTo(
                                Click.on(MeetingsPage.DROPDOWN_ATTENDEE_LIST),
                                Enter.theValue(attendee).into(MeetingsPage.SELECT2_ATTENDEE_INPUT),
                                Hit.the(Keys.ENTER).into(MeetingsPage.SELECT2_ATTENDEE_INPUT)
                        );
                    }
                }
        );
    }


    public static ScheduleMeeting withData(MeetingData meetingData) {
        return Instrumented.instanceOf(ScheduleMeeting.class).withProperties(meetingData);
    }
}