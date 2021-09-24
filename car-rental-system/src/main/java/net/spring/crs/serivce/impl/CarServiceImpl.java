package net.spring.crs.serivce.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.spring.crs.entity.Car;
import net.spring.crs.repo.CarsRepository;
import net.spring.crs.serivce.CarService;

@Service
public class CarServiceImpl implements CarService {

	// Constructor based dependency dependency injection.
	// As there is only one constructor @autowired annotation can be skipped.

	private CarsRepository carsRepository;

	private Car car = new Car();

	public CarServiceImpl(CarsRepository carsRepository) {
		super();
		this.carsRepository = carsRepository;
	}

	@Override
	public List<Car> getAllCars() {

		// Provides us with all the crud method.
		// Create,read,update,delete
		return carsRepository.findAll();
	}

	@Override
	public Car addNewBooking(Car car) {

		return carsRepository.save(car);
	}

	@Override
	public void deleteBookingById(Long id) {
		// TODO Auto-generated method stub

		carsRepository.deleteById(id);
	}

	@Override
	public void addWheels(Long wheels) {

		car.setWheels(wheels);

	}

}
