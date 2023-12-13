package com.azizmalik.demo;

import Services.Implementations.ColorPrinter;
import Services.iColorPrinter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class BeansImplementationApplication implements CommandLineRunner {
	private final iColorPrinter Printer;
	public BeansImplementationApplication(iColorPrinter cp){
		this.Printer = cp;
	}

	public static void main(String[] args) {
		SpringApplication.run(BeansImplementationApplication.class, args);
	}
	@Override
	public void run(final String... args){
		log.info(this.Printer.print());
	}

}
