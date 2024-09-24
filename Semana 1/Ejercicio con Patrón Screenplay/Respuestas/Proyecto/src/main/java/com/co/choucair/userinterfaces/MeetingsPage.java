package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingsPage {

    public static final Target BTN_NEW_MEETING = Target.the("button to schedule new meeting")
            .located(By.xpath("//div[@data-action='add' and contains(@class, 'add-button')]"));

    public static Target MEETING_ROW(String meetingTitle, String businessUnit) {
        return Target.the("Meeting row with title " + meetingTitle + " and business unit " + businessUnit)
                .locatedBy("//div[contains(@class,'slick-row')][.//div[contains(@class,'l1') and .//a[text()='{0}']] and .//div[contains(@class,'l7') and normalize-space(text())='{1}']]")
                .of(meetingTitle, businessUnit);
    }



    public static final Target INPUT_MEETING_NAME = Target.the("input for Meeting Name")
            .located(By.xpath("//input[@name='MeetingName']"));

    public static final Target INPUT_MEETING_NUMBER = Target.the("input for meeting number")
            .located(By.xpath("//input[@name='MeetingNumber' and contains(@class, 's-StringEditor')]"));

    public static final Target INPUT_START_DATE = Target.the("input for Start Date")
            .located(By.xpath("//input[@name='StartDate' and contains(@class, 's-DateTimeEditor')]"));

    public static final Target INPUT_END_DATE = Target.the("input for End Date")
            .located(By.xpath("//input[@name='EndDate' and contains(@class, 's-DateTimeEditor')]"));



    public static final Target DROPDOWN_MEETING_TYPE = Target.the("Meeting type dropdown")
            .located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId']/a"));

    public static final Target DROPDOWN_LOCATION = Target.the("dropdown for meeting location")
            .located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId']/a"));

    public static final Target DROPDOWN_UNIT = Target.the("dropdown for business unit")
            .located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId']/a"));

    public static final Target DROPDOWN_ORGANIZER = Target.the("dropdown for organizer")
            .located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId']/a"));

    public static final Target DROPDOWN_REPORTER = Target.the("dropdown for reporter")
            .located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId']/a"));

    public static final Target DROPDOWN_ATTENDEE_LIST = Target.the("attendee list")
            .located(By.xpath("//div[@id='Serenity_Pro_Meeting_MeetingDialog10_AttendeeList']/div//a[@class='select2-choice select2-default']"));



    public static final Target SELECT2_INPUT_TYPE = Target.the("select2 input field")
            .located(By.xpath("//input[@id='s2id_autogen6_search']"));

    public static final Target SELECT2_INPUT_LOCATION = Target.the("input field for location")
            .located(By.xpath("//input[@id='s2id_autogen7_search']"));

    public static final Target SELECT2_INPUT_UNIT = Target.the("input field for unit")
            .located(By.xpath("//input[@id='s2id_autogen8_search']"));

    public static final Target SELECT2_INPUT_ORGANIZER = Target.the("input field for organizer")
            .located(By.xpath("//input[@id='s2id_autogen9_search']"));

    public static final Target SELECT2_INPUT_REPORTER = Target.the("input field for reporter")
            .located(By.xpath("//input[@id='s2id_autogen10_search']"));

    public static final Target SELECT2_ATTENDEE_INPUT = Target.the("input field for reporter")
            .located(By.xpath("//input[@id='s2id_autogen12_search']"));

    public static final Target BTN_SCHEDULE = Target.the("button to schedule meeting")
            .located(By.xpath("//div[contains(@class, 'tool-button') and @data-action='save-and-close']"));
}
