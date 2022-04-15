package com.ejemplo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    private String mensaje = "Cargando página...";

    @GetMapping("/")
    public String getMainPage(){
        System.out.println(mensaje);
        return "home-page";
    }
}
