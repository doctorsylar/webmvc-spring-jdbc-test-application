package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/")
public class MainController {

    @GetMapping ("/")
    public String homepage () {
        return "index";
    }

    @GetMapping ("/test")
    public String testLink () {
        return "test";
    }
}
