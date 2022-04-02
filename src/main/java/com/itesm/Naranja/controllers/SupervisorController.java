package com.itesm.Naranja.controllers;

import com.itesm.Naranja.models.Supervisor;
import com.itesm.Naranja.services.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/supervisor")
public class SupervisorController {
    @Autowired
    SupervisorService supervisorService;

    @GetMapping("/allSupervisors")
    public List<Supervisor> getAllAgents(){
        return supervisorService.getAllSupervisors();
    }

    @GetMapping("/update")
    public void updateSupervisorName(){
    }

    @GetMapping("/searchByID")
    public Supervisor getSupervisorByID(String ID){
        return supervisorService.getSupervisorByID(ID);
    }

    @PostMapping("/save")
    public Supervisor save(@RequestBody Supervisor supervisor){
        supervisorService.insertar(supervisor);
        return supervisor;
    }
}
