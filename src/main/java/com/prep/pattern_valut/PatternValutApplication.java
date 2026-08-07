package com.prep.pattern_valut;


import com.prep.pattern_valut.behavioral.command.basicWithReturnType.*;
import com.prep.pattern_valut.behavioral.command.basicWithReturnType.mail.MailService;
import com.prep.pattern_valut.behavioral.command.basicWithReturnType.report.ReportGenerator;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {

		CommandQueue commandQueue = new CommandQueue();
		MailService mailService = new MailService();
		var mailRequest = new SendMailRequest
				("joe@gmail.com", "mark@yahoo.com","Greetings");
		Command command = new SendMailCommand(mailService,mailRequest);

		ReportGenerator reportGenerator = new ReportGenerator();
		ReportGeneratorCommand reportGeneratorCommand = new ReportGeneratorCommand<>(reportGenerator);
		reportGeneratorCommand.addData("data1","value1");
		reportGeneratorCommand.addData("data2","value2");
		reportGeneratorCommand.addData("data3","value3");
		commandQueue.submitCommand(command);
		commandQueue.submitCommand(reportGeneratorCommand);
		commandQueue.executeAll();
	}

}
