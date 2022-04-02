package com.itesm.Naranja.controllers;

import com.itesm.Naranja.models.Agente;
import com.itesm.Naranja.models.Supervisor;
import com.itesm.Naranja.services.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class SupervisorController {
    @Autowired
    SupervisorService supervisorService;


    @RequestMapping(
            value = "/v1/supervisor/allSupervisors",
            method = RequestMethod.GET,
            consumes = {"application/json"},
            produces = "application/json"
    )
    public List<Supervisor> getAllSupervisors(){
        return supervisorService.getAllSupervisors();
    }

    @RequestMapping(
            value = "/v1/supervisor/update",
            method = RequestMethod.GET,
            consumes = {"application/json"},
            produces = "application/json"
    )
    public void updateSupervisorName(){
    }

    @RequestMapping(
            value = "/v1/supervisor/searchByID",
            method = RequestMethod.GET,
            consumes = {"application/json"},
            produces = "application/json"
    )
    public Supervisor getSupervisorByID(String ID){
        return supervisorService.getSupervisorByID(ID);
    }

    @RequestMapping(
            value = "/v1/supervisor/allSupervisors",
            method = RequestMethod.POST,
            consumes = {"application/json"},
            produces = "application/json"
    )
    public Supervisor save(@RequestBody Supervisor supervisor){
        supervisorService.insertSupervisor(supervisor);
        System.out.println(supervisor.toString());
        return supervisor;
    }
}
