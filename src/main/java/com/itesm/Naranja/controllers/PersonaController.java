package com.itesm.Naranja.controllers;
import com.itesm.Naranja.models.Persona;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/persona")
public class PersonaController {

    @GetMapping("/perfil")
    public Persona getPerfil(){
        Persona p = new Persona();
        p.setNombre("Diego");
        p.setEdad(32);
        return p;
    }
}
