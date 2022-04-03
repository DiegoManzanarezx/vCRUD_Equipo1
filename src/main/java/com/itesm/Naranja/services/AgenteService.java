package com.itesm.Naranja.services;

import com.itesm.Naranja.models.Agente;
import com.itesm.Naranja.models.Manager;
import com.itesm.Naranja.repositories.AgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class AgenteService {
    @Autowired
    AgenteRepository agenteRepository;

    public List<Agente> getAllAgents(){
        return agenteRepository.findAllAgents();
    }

    public Agente getAgentByID(@PathVariable("ID") String ID){
        return agenteRepository.findAgentByID(ID);
    }

    public Agente insertAgent(Agente agent){
        return agenteRepository.insertAgent(agent);
    }

    public Agente deleteAgent(@PathVariable("ID") String ID){
        return agenteRepository.deleteAgent(ID);
    }

    public Agente updateAgentName(@PathVariable("ID") String ID, @PathVariable("newName") String newName){
        return agenteRepository.updateAgentName(ID, newName);
    }
}
