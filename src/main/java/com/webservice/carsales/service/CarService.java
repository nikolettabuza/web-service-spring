package com.webservice.carsales.service;

import com.webservice.carsales.model.Car;

import java.util.List;

public interface CarService {

    void setCars();

    List<Car> getAllCars();

    Car getCarById(Long id);
}
