package com.solirius.hosehackathon;

import com.solirius.hosehackathon.domain.Office;
import com.solirius.hosehackathon.repository.OfficeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HoSeHackathonApplication {

	OfficeRepository repo;

	public static void main(String[] args) {

		SpringApplication.run(HoSeHackathonApplication.class, args);
	}
}
