package com.prep.pattern_vault.behavioral.command.basicwithreturntype;

import com.prep.pattern_vault.behavioral.command.basicwithreturntype.report.ReportGenerator;

public class ReportGeneratorCommand implements Command<String> {

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
