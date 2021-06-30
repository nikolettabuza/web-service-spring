package com.webservice.carsales.controller;

import com.webservice.carsales.model.Car;
import com.webservice.carsales.model.ErrorMsgProvider;
import com.webservice.carsales.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/t/cars")
    public String getCars(Model model) {
        List<Car> cars = carService.getAllCars();
        Car car = cars.get(0);
        Car car1 = cars.get(1);
        model.addAttribute("car", car.getManufacturer() + " " + car.getModelName());
        model.addAttribute("car1", car1.getManufacturer() + " " + car1.getModelName());
        return "cars";
    }

    @GetMapping("/cars")
    @ResponseBody
    public List<Car> getCarsJSON() {
        return carService.getAllCars();
    }


    @GetMapping("/t/car/{id}")
    public String getCarById(@PathVariable Long id, Model model) {
        Car car = carService.getCarById(id);
        model.addAttribute("id", id);
        if (car != null) {
            model.addAttribute("car", car.getManufacturer() + " " + car.getModelName());
            return "car";
        }
        return "nosuchcar";
    }

    @GetMapping("/car/{id}")
    @ResponseBody
    public Object getCarByIdJSON(@PathVariable Long id) {
        Car car = carService.getCarById(id);
        if (car != null) {
            return car;
        }
        return new ErrorMsgProvider("There is no car found by the ID <" + id + ">");
    }
}
