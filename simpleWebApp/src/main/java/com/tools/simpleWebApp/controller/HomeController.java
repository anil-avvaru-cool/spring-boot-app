package com.tools.simpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Productivity tools";
    }

    @RequestMapping("/about")
    public String about(){
        return "We are group of passionated people";
    }
}
