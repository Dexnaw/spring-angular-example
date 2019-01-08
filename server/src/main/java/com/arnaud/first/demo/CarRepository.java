package com.arnaud.first.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface CarRepository extends JpaRepository<Car, Long> {
}
