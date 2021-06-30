package com.webservice.carsales.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Car {

    Long id;
    String manufacturer;
    String modelName;

    public Car(Long id, String manufacturer, String modelName) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.modelName = modelName;
    }
}
