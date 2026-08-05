package com.prep.pattern_valut;


import com.prep.pattern_valut.structural.facade.TravelBookingFacade;
import com.prep.pattern_valut.structural.facade.dto.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.UUID;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {
		TravelBookingFacade bookingFacade = new TravelBookingFacade(
				new User("Leo", UUID.randomUUID(),"leo@gmail.com"));
		var result = bookingFacade.bookTrip();
		System.out.println(result);
	}

}
