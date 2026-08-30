package com.prep.pattern_vault.behavioral.template;

import com.prep.pattern_vault.behavioral.template.dto.ReportData;

import java.time.LocalDate;
import java.util.List;

public class ReportRepository {

    public ReportData load(LocalDate fromDate, LocalDate toDate) {

        System.out.println("Loading report data");
        return new ReportData(List.of("Order-1,100.00", "Order-2,75.50"));
    }
}