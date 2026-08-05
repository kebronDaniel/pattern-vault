package com.prep.pattern_valut.behavioral.template.dto;

import java.time.LocalDate;

public record ReportRequest(
        String reportName,
        LocalDate fromDate,
        LocalDate toDate
) {}