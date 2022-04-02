package com.itesm.Naranja.controllers;

import com.itesm.Naranja.models.Agente;
import com.itesm.Naranja.services.AgenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/agente")
public class AgenteController {

    @Autowired
    AgenteService agenteService;

    @GetMapping("/allAgents")
    public List<Agente> getAllAgents(){
        return agenteService.getAllAgents();
    }

    @GetMapping("/update")
    public void updateAgentName(){
    }

    @GetMapping("/searchByID")
    public Agente getAgentByID(String ID){
        return agenteService.getAgentByID(ID);
    }

    @PostMapping("/save")
    public Agente save(@RequestBody Agente agente){
        agenteService.insertar(agente);
        return agente;
    }

}
