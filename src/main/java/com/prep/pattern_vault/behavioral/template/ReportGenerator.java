package com.prep.pattern_vault.behavioral.template;

import com.prep.pattern_vault.behavioral.template.dto.ReportData;
import com.prep.pattern_vault.behavioral.template.dto.ReportRequest;
import com.prep.pattern_vault.behavioral.template.dto.ReportResult;

public abstract class ReportGenerator {

    private final ReportStorage reportStorage;
    private final ReportRepository repository;

    public ReportGenerator(ReportStorage reportStorage, ReportRepository repository) {
        this.reportStorage = reportStorage;
        this.repository = repository;
    }

    public final ReportResult generate(ReportRequest request){
        if (validate(request)){
            var data = loadData(request);
            var transformedData = transformData(data);
            var formattedReport = format(transformedData);
            var fileName = buildFileName(request);
            reportStorage.save(fileName,formattedReport);
            return new ReportResult(request.reportName(),formattedReport,fileName);
        }
        throw new IllegalArgumentException("Couldn't generate report, Invalid request");
    }

    private boolean validate(ReportRequest request){
        System.out.println("validating report");
        return !request.fromDate().equals(request.toDate()) && request.reportName() != null;
    }

    private ReportData loadData(ReportRequest request){
        return repository.load(request.fromDate(), request.toDate());
    }

    private String buildFileName(ReportRequest request) {
        return request.reportName() + fileExtension();
    }

    protected abstract String fileExtension();
    protected abstract String format(ReportData data);
    protected abstract ReportData transformData(ReportData data);


}
