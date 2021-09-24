package net.spring.crs.serivce;

import java.util.List;

import net.spring.crs.entity.Car;

public interface CarService {

	List<Car> getAllCars();

	Car addNewBooking(Car car);

	void deleteBookingById(Long id);

	void addWheels(Long id);
}
