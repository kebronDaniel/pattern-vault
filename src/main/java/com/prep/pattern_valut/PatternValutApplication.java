package com.prep.pattern_valut;


import com.prep.pattern_valut.behavioral.chainOfResponsibility.handlerChain.PaymentPipelineFactory;
import com.prep.pattern_valut.behavioral.chainOfResponsibility.handlerChain.PaymentRequest;
import com.prep.pattern_valut.behavioral.chainOfResponsibility.handlerChain.PaymentSupportHandler;
import com.prep.pattern_valut.behavioral.chainOfResponsibility.singleHandler.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {

		PaymentPipelineFactory paymentPipelineFactory = new PaymentPipelineFactory();
		PaymentSupportHandler chain = paymentPipelineFactory.constructChain();
		chain.handle(new PaymentRequest(null,"00011122",11000));
	}

}
