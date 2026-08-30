package com.prep.pattern_vault.behavioral.template;

import com.prep.pattern_vault.behavioral.template.dto.ReportData;

import java.util.stream.Collectors;

public class CsvReportGenerator extends ReportGenerator {
    public CsvReportGenerator(ReportStorage reportStorage, ReportRepository repository) {
        super(reportStorage, repository);
    }

    @Override
    protected String fileExtension() {
        return ".csv";
    }

    @Override
    protected String format(ReportData data) {
        // have a custom implementation here.
        return String.format("Report formatted for csv file format.");
    }

    @Override
    protected ReportData transformData(ReportData data) {
        System.out.println("Transforming data");
        return new ReportData(data.rows().stream().collect(Collectors.toSet()));
    }
}
