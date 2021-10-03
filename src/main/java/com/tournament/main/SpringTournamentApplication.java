package com.tournament.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.tournament.main.controller")
public class SpringTournamentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTournamentApplication.class, args);
		System.out.println("first commit");
	}
	
	
}
