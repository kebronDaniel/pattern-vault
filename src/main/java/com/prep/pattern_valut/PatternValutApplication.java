package com.prep.pattern_valut;


import com.prep.pattern_valut.behavioral.chainOfResponsibility.handlerChain.PaymentPipelineFactory;
import com.prep.pattern_valut.behavioral.chainOfResponsibility.handlerChain.PaymentRequest;
import com.prep.pattern_valut.behavioral.chainOfResponsibility.handlerChain.PaymentSupportHandler;
import com.prep.pattern_valut.behavioral.chainOfResponsibility.singleHandler.*;
import com.prep.pattern_valut.behavioral.template.PdfReportGenerator;
import com.prep.pattern_valut.behavioral.template.ReportRepository;
import com.prep.pattern_valut.behavioral.template.ReportStorage;
import com.prep.pattern_valut.behavioral.template.dto.ReportData;
import com.prep.pattern_valut.behavioral.template.dto.ReportRequest;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {

		ReportRequest request = new ReportRequest("sample report"
				,LocalDate.now().minusDays(1),LocalDate.now());

		PdfReportGenerator pdfReportGenerator = new PdfReportGenerator(new ReportStorage(),new ReportRepository());
		pdfReportGenerator.generate(request);
	}

}
