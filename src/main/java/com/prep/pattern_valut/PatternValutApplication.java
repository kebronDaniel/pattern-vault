package com.prep.pattern_valut;


import com.prep.pattern_valut.behavioral.state.MusicPlayer.AudioPlayer;
import com.prep.pattern_valut.behavioral.state.order.Order;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {

		Order order = new Order();
		System.out.println(order.getCurrentState());
		order.pay();
		System.out.println(order.getCurrentState());
		order.ship();
		System.out.println(order.getCurrentState());
		order.deliver();
		System.out.println(order.getCurrentState());
		order.cancel();
		System.out.println(order.getCurrentState());
	}

}
