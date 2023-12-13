package com.azizmalik.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class BeansImplementationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BeansImplementationApplication.class, args);
	}
	@Override
	public void run(final String... args){
		log.info("Beans Coming your way!!!");
	}

}
