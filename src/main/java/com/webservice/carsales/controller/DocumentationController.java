package com.webservice.carsales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocumentationController {

    @GetMapping
    public String availableEndpoints() {
        return "docs";
    }
}
