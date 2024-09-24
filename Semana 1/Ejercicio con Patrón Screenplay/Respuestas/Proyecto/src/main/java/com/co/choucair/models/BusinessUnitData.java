package com.co.choucair.models;

import io.cucumber.datatable.DataTable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BusinessUnitData {

    private String name;

    // Getters y Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<BusinessUnitData> setData(DataTable table){
        List<BusinessUnitData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            BusinessUnitData bu = new BusinessUnitData();
            bu.setName(map.get("name"));
            data.add(bu);
        }
        return data;
    }
}
