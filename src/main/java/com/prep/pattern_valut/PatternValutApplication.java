package com.prep.pattern_valut;


import com.prep.pattern_valut.behavioral.command.basicWithReturnType.*;
import com.prep.pattern_valut.creational.singleton.ConfigDbConnection;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {

		ConfigDbConnection configDbConnection = ConfigDbConnection.getInstance();
		ConfigDbConnection configDbConnection2 = ConfigDbConnection.getInstance();
		System.out.println(configDbConnection2.getInstanceCounter());
	}

}
