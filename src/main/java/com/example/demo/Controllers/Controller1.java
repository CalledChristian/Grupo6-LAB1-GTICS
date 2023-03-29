package com.example.demo.Controllers;

import com.example.demo.entities.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller1 {
    @GetMapping("/login")
    public String inicio(){
        return "registroTelec";
    }

    @GetMapping("/homePage1")
    public String momePage(){
        return "homepage";
    }



    @GetMapping("/newUser")
    public String nuevoUsuario(){

        return "formulario";
    }


    @PostMapping("/guardar")
    public String guardarUsuario(@RequestParam("nombreCompleto") String nombreCompleto,
                                @RequestParam("usuario") String user,
                                 @RequestParam("correo") String correo,
                                 @RequestParam("contrasena") String contrasena,
                                @RequestParam("contrasena_r") String contrasena_r){

        Usuario usuario = new Usuario();
       usuario.setNombreCompleto(nombreCompleto);
       usuario.setUsuario(user);
       usuario.setCorreo(correo);
       usuario.setContrasena(contrasena);
        return "datosUsuario";
    }
}
