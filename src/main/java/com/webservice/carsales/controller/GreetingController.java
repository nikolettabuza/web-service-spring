package com.webservice.carsales.controller;

import com.webservice.carsales.model.ResponseProvider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping(value = {"/t/greeting", "/t/greeting/{name}"})
    public String greeting(@PathVariable(required = false) String name, Model model) {
        String actualName = name != null ? name : "XY";
        model.addAttribute("name", actualName);
        return "greeting";
    }

    @GetMapping(value = {"/greeting", "/greeting/{name}"})
    @ResponseBody
    public ResponseProvider greetingJSON(@PathVariable(required = false) String name) {
        String actualName = name != null ? name : "XY";
        String responseMsg = "Welcome, " + actualName + "!";
        return new ResponseProvider(responseMsg);
    }
}
