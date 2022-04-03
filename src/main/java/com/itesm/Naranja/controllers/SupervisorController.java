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
            produces = "application/json"
    )
    @ResponseBody
    public List<Supervisor> getAllSupervisors(){
        return supervisorService.getAllSupervisors();
    }


    @RequestMapping(
            value = "/v1/supervisor/update/{ID}/{newName}",
            method = RequestMethod.PUT,
            produces = "application/json"
    )
    @ResponseBody
    public Supervisor updateSupervisorName(@PathVariable("ID") String ID, @PathVariable("newName") String newName){
        return supervisorService.updateSupervisorName(ID, newName);
    }


    @RequestMapping(
            value = "/v1/supervisor/searchByID/{ID}",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseBody
    public Supervisor getSupervisorByID(@PathVariable("ID") String ID){
        return supervisorService.getSupervisorByID(ID);
    }


    @RequestMapping(
            value = "/v1/supervisor/save",
            method = RequestMethod.POST,
            produces = "application/json"
    )
    @ResponseBody
    public Supervisor save(@RequestBody Supervisor supervisor){
        supervisorService.insertSupervisor(supervisor);
        return supervisor;
    }


    @RequestMapping(
            value = "/v1/supervisor/delete/{ID}",
            method = RequestMethod.DELETE,
            produces = "application/json"
    )
    @ResponseBody
    public void deleteSupervisor(@PathVariable("ID") String ID){
        supervisorService.deleteSupervisor(ID);
    }
}
