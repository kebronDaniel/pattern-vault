package com.prep.pattern_valut.behavioral.command.basicWithReturnType.report;

import java.util.HashMap;

public class ReportGenerator {

    private final HashMap<String, String> data = new HashMap<>();

    public void addData(String key, String value){
        data.put(key,value);
    }

    public void generateData(){
        // implementation left here
        System.out.printf("Report data generated for %s rows \n", data.size());
    }
}
