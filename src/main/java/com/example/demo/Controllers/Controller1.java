package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller1 {
    @GetMapping(value = "/homepage")
    public String homepage(){

        return "homepage";
    }
}
