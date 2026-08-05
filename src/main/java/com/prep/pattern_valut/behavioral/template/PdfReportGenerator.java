package com.prep.pattern_valut.behavioral.template;

import com.prep.pattern_valut.behavioral.template.dto.ReportData;

public class PdfReportGenerator extends ReportGenerator {
    public PdfReportGenerator(ReportStorage reportStorage, ReportRepository repository) {
        super(reportStorage, repository);
    }

    @Override
    protected String fileExtension() {
        return ".pdf";
    }

    @Override
    protected String format(ReportData data) {
        // have a custom implementation here.
        return String.format("Report formatted for pdf file format.");
    }

    @Override
    protected ReportData transformData(ReportData data) {
        System.out.println("Transforming data");
        return new ReportData(data.rows().stream().toList());
    }
}
