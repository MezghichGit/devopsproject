package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsGkApplication {

	public static void main(String[] args) {
		System.out.println("Hello GK");
		System.out.println("Un premier code de amine");
		System.out.println("Deuxième changement dans la branch master");
		SpringApplication.run(DevopsGkApplication.class, args);
	}

}
