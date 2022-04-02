package com.itesm.Naranja.services;

import com.itesm.Naranja.models.Agente;
import com.itesm.Naranja.repositories.AgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenteService {

    @Autowired
    AgenteRepository agenteRepository;

    public List<Agente> getAllAgents(){
        return agenteRepository.findAllAgents();
    }

    public Agente getAgentByID(String ID){
        return agenteRepository.findAgentByID(ID);
    }

    public Agente insertar(Agente agente){
        //personaRepository.insert();
        return agente;
    }
}
