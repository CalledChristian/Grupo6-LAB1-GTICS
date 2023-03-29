package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value="/",method = RequestMethod.GET)
public class Controller1 {


    @GetMapping(value="/login")

    public String logeo(){

        return "";
    }



    @GetMapping(value="/newUser")
    public String nuevoUsuario(){

        return "";
    }
}
