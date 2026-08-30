package com.prep.pattern_vault;


import com.prep.pattern_vault.behavioral.command.basicwithreturntype.*;
import com.prep.pattern_vault.creational.singleton.ConfigDbConnection;
import com.prep.pattern_vault.creational.singleton.ResourceProvision;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternVaultApplication {

	public static void main(String[] args) {

		ConfigDbConnection configDbConnection = ConfigDbConnection.getInstance();
		ConfigDbConnection configDbConnection2 = ConfigDbConnection.getInstance();
		System.out.println(configDbConnection2.getInstanceCounter());

		var resource = ResourceProvision.GET_RESOURCE;
		var resource2 = ResourceProvision.GET_RESOURCE;
		System.out.println(resource == resource2);
	}

}
