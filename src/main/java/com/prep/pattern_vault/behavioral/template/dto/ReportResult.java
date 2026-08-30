package com.prep.pattern_vault.behavioral.template.dto;

public record ReportResult(
        String reportName,
        String format,
        String location
) {}