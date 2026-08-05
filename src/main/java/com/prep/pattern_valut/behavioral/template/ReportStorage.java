package com.prep.pattern_valut.behavioral.template;

public class ReportStorage {

    public String save(String fileName, String content) {
        System.out.printf("Saving %s%n", fileName);
        return "/reports/" + fileName;
    }
}