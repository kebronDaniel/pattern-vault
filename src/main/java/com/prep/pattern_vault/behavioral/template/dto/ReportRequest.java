package com.prep.pattern_vault.behavioral.template.dto;

import java.time.LocalDate;

public record ReportRequest(
        String reportName,
        LocalDate fromDate,
        LocalDate toDate
) {}