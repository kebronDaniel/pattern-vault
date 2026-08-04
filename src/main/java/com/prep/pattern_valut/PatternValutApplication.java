package com.prep.pattern_valut;

import com.prep.pattern_valut.creational.builder.Address;
import com.prep.pattern_valut.creational.builder.Order;
import com.prep.pattern_valut.creational.builder.OrderItem;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {

		Address address = new Address("Main St 12", "Cologne", "50667","DEU");
		List<OrderItem> items = List.of(new OrderItem("Item-1", 2, BigDecimal.valueOf(20)));

		Order order = new Order.Builder("CUST-99", items, address, new BigDecimal("149.99"))
				.expressDelivery(true)
				.giftWrap(true)
				.customerNote("Please leave at the front door")
				.couponCode("SUMMER2026")
				.currency("EUR")
				.build();
		System.out.println(order.getCustomerNote());
	}

}
