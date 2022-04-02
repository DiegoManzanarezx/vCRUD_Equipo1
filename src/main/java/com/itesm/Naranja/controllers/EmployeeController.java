package com.itesm.Naranja.controllers;

import com.itesm.Naranja.models.Employee;
import com.itesm.Naranja.models.Persona;
import com.itesm.Naranja.services.EmployeeService;
import com.itesm.Naranja.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employee")

public class EmployeeController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/perfil")
    public Persona getPerfil(){
        Persona p= new Persona();
        p.setNombre("Andrés");
        p.setEdad(32);
        return p;
    }

    @GetMapping("/all")
    public List<Persona> getAll(){
        return personaService.getAll();
    }

    @PostMapping("/save")
    public Persona save(@RequestBody Persona persona) throws Exception{
        personaService.insertar(persona);
        return persona;
    }
}
