package com.prep.pattern_valut;

import com.prep.pattern_valut.behavioral.observer.*;
import com.prep.pattern_valut.structural.adapter.QuickShipAdapter;
import com.prep.pattern_valut.structural.adapter.QuickShipClient;
import com.prep.pattern_valut.structural.adapter.Shipment;
import com.prep.pattern_valut.structural.adapter.ShippingGateway;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {

		ShippingGateway shippingGateway = new QuickShipAdapter(new QuickShipClient());
		var result = shippingGateway.calculateQuote
				(new Shipment("US","Germany", BigDecimal.valueOf(10)));
		System.out.println(result);
	}

}
