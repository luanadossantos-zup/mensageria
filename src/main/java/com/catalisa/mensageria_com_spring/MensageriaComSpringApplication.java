package com.catalisa.mensageria_com_spring;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MensageriaComSpringApplication implements CommandLineRunner {

	@Autowired
	private MeuEventoPublisher meuEventoPublisher;

	public static void main(String[] args) {
		SpringApplication.run(MensageriaComSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		meuEventoPublisher.publicarEvento("Olá, este é um evento do Spring!");
	}

}
