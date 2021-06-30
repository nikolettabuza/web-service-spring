package com.webservice.carsales.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseProvider {
    String message;

    public ResponseProvider(String message) {
        this.message = message;
    }
}
