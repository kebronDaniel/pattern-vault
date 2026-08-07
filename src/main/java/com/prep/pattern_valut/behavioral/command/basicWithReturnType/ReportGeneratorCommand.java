package com.prep.pattern_valut.behavioral.command.basicWithReturnType;

import com.prep.pattern_valut.behavioral.command.basicWithReturnType.report.ReportGenerator;

public class ReportGeneratorCommand<R> implements Command<String> {

    private final ReportGenerator reportGenerator;

    public ReportGeneratorCommand(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void addData(String key, String value){
        reportGenerator.addData(key,value);
    }

    @Override
    public String execute() {
        reportGenerator.generateData();
        return "Report Generation Completed";
    }
}
