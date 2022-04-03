package com.itesm.Naranja.services;

import com.itesm.Naranja.models.Agente;
import com.itesm.Naranja.models.Manager;
import com.itesm.Naranja.models.Supervisor;
import com.itesm.Naranja.repositories.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class SupervisorService {
    @Autowired
    SupervisorRepository supervisorRepository;

    public List<Supervisor> getAllSupervisors(){
        return supervisorRepository.findAllSupervisors();
    }

    public Supervisor getSupervisorByID(@PathVariable("ID") String ID){
        return supervisorRepository.findSupervisorByID(ID);
    }

    public Supervisor insertSupervisor(Supervisor supervisor){
        return supervisorRepository.insertSupervisor(supervisor);
    }

    public Supervisor deleteSupervisor(@PathVariable("ID") String ID){
        return supervisorRepository.deleteSupervisor(ID);
    }

    public Supervisor updateSupervisorName(@PathVariable("ID") String ID, @PathVariable("newName") String newName){
        return supervisorRepository.updateSupervisorName(ID, newName);
    }
}
