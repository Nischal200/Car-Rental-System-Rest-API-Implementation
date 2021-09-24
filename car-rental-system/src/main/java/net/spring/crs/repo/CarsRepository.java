package net.spring.crs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.spring.crs.entity.Car;

//First paremeter type of jpa entity
//Second Parameter type of primary key.

//We don't need to add a @Repositery class as Simple Jpa repo already has that annotation.
// JpaRepositiery also provides transactional to all its methods by default.

//Interface is completely abstract 
// Interface has methods with empty bodys and constant feilds.

public interface CarsRepository extends JpaRepository<Car, Long> {

}
