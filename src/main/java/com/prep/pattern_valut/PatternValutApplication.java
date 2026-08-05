package com.prep.pattern_valut;

import com.prep.pattern_valut.behavioral.observer.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {

		UserEventPublisher publisher = new UserEventPublisher();
		publisher.register(new LoyaltyPointsListener());
		publisher.register(new WelcomeEmailListener());
		publisher.register(new AuditLogListener());
		publisher.register(new AnalyticsListener());
		UserRegistrationService registrationService = new UserRegistrationService(publisher);
		registrationService.register("kebron", "kebron@gmail.com");
	}

}
