package com.itesm.Naranja.services;

import com.itesm.Naranja.models.Supervisor;
import com.itesm.Naranja.repositories.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupervisorService {
    @Autowired
    SupervisorRepository supervisorRepository;

    public List<Supervisor> getAllSupervisors(){
        return supervisorRepository.findAllSupervisors();
    }

    public Supervisor getSupervisorByID(String ID){
        return supervisorRepository.findSupervisorByID(ID);
    }

    public Supervisor insertar(Supervisor supervisor){
        //personaRepository.insert();
        return supervisor;
    }
}
