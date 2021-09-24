package net.spring.crs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.spring.crs.repo.CarsRepository;

@SpringBootApplication
public class CarRentalSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalSystemApplication.class, args);
	}

	@Autowired
	private CarsRepository carsRepository;

	@Override
	public void run(String... args) throws Exception {

	}

}
