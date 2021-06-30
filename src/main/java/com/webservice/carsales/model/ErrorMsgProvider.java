package com.webservice.carsales.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorMsgProvider {

    String message;

    public ErrorMsgProvider(String message) {
        this.message = message;
    }
}
