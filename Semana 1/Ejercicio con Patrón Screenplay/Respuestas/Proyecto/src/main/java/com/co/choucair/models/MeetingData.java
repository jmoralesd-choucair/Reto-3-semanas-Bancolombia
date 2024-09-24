package com.co.choucair.models;

import io.cucumber.datatable.DataTable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MeetingData {

    private String title;
    private String type;
    private String location;
    private String unit;
    private String organizer;
    private String reporter;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public static List<MeetingData> setData(DataTable table){
        List<MeetingData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            MeetingData meeting = new MeetingData();
            meeting.setTitle(map.get("title"));
            meeting.setType(map.get("type"));
            meeting.setLocation(map.get("location"));
            meeting.setUnit(map.get("unit"));
            meeting.setOrganizer(map.get("organizer"));
            meeting.setReporter(map.get("reporter"));
            data.add(meeting);
        }
        return data;
    }
}
