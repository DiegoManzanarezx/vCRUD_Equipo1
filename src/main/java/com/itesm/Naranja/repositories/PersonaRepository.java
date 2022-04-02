package com.itesm.Naranja.repositories;


import com.itesm.Naranja.models.Persona;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonaRepository {

    public List<Persona> findAll(){
        Persona p1= new Persona();
        p1.setNombre("Andres");
        p1.setEdad(32);
        Persona p2= new Persona();
        p2.setNombre("Paola");
        p2.setEdad(21);
        List<Persona> personas= new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        return personas;
    }

}