package com.mentorADA.reservasautobuses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mentorADA.reservasautobuses")
public class SistemaDeReservasDeAutobusesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeReservasDeAutobusesApplication.class, args);
	}

}
