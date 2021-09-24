package net.spring.crs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.spring.crs.entity.Car;
import net.spring.crs.serivce.CarService;

//Tells us that the class is a web controller
//This will handle the request

@Controller
public class CarController {

	// Constructor based dependency dependency injection.
	// As only one constructor autowired annotation can be skipped.

	private CarService carService;

	private Car car;

	public CarController(CarService carService) {
		super();
		this.carService = carService;
	}

	// Handles list students and returns model and view.

	@GetMapping("/booking")
	public String listStudnets(Model model) {
		model.addAttribute("booking", carService.getAllCars());

		// returning student view
		return "booking";

	}

	// Handles the add booking event
	@GetMapping("/booking/new")
	public String createBookingForm(Model model) {

		// Create empty student object to hold student form data
		Car car = new Car();
		model.addAttribute("car", car);
		return "create_booking";

	}

//@Modelattribute is used to bind modeldata to the object
	@PostMapping("/booking")
	public String saveBooking(@ModelAttribute("car") Car car) {

		carService.addNewBooking(car);
		return "redirect:/booking";
	}

	// Handler method delets booking
	@GetMapping("/booking/{id}")
	public String deleteBooking(@PathVariable Long id) {

		carService.deleteBookingById(id);

		return "redirect:/booking";
	}

	@GetMapping("/booking/{Wheels}")
	public String addCar(@PathVariable Long Wheels) {

		carService.addWheels(Wheels);
		return "create_booking";

	}

}
