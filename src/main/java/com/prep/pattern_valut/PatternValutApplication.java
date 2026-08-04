package com.prep.pattern_valut;

import com.prep.pattern_valut.behavioral.strategy.NotificationServiceConsumer;
import com.prep.pattern_valut.behavioral.strategy.NotificationServiceRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(PatternValutApplication.class, args);
		NotificationServiceConsumer consumer = context.getBean(NotificationServiceConsumer.class);
		consumer.doSomething();
	}

}
