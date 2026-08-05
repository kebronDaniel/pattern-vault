package com.prep.pattern_valut;


import com.prep.pattern_valut.behavioral.chainOfResponsibility.singleHandler.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {

		SupportHandler basicSupportHandler = new BasicSupportHandler();
		SupportHandler technicalSupportHandler = new TechnicalSupportHandler();
		SupportHandler seniorSupportHandler = new SeniorSupportHandler();
		SupportHandler emergencySupportHandler = new EmergencySupportHandler();

		basicSupportHandler
				.setNext(technicalSupportHandler)
				.setNext(seniorSupportHandler)
				.setNext(emergencySupportHandler);

		SupportTicket supportTicket = new SupportTicket(UUID.randomUUID().toString(),UUID.randomUUID().toString()
				, Severity.CRITICAL,"Server not responding");

		SupportResult result = basicSupportHandler.handle(supportTicket);
		System.out.println(result);
	}

}
