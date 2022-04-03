package com.itesm.Naranja.controllers;

import com.itesm.Naranja.models.Agente;
import com.itesm.Naranja.services.AgenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class AgenteController {
    @Autowired
    AgenteService agenteService;

    @RequestMapping(
            value = "/v1/agent/allAgents",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseBody
    public List<Agente> getAllAgents(){
        return agenteService.getAllAgents();
    }


    @RequestMapping(
            value = "/v1/agent/update/{ID}/{newName}",
            method = RequestMethod.PUT,
            produces = "application/json"
    )
    @ResponseBody
    public Agente updateAgentName(@PathVariable("ID") String ID, @PathVariable("newName") String newName){
        return agenteService.updateAgentName(ID, newName);
    }


    @RequestMapping(
            value = "/v1/agent/searchByID/{ID}",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseBody
    public Agente getAgentByID(@PathVariable("ID") String ID){
        return agenteService.getAgentByID(ID);
    }


    @RequestMapping(
            value = "/v1/agent/save",
            method = RequestMethod.POST,
            produces = "application/json"
    )
    @ResponseBody
    public Agente save(@RequestBody Agente agente){
        agenteService.insertAgent(agente);
        return agente;
    }

    @RequestMapping(
            value = "/v1/supervisor/delete/{ID}",
            method = RequestMethod.DELETE,
            produces = "application/json"
    )
    @ResponseBody
    public void deleteAgent(@PathVariable("ID") String ID){
        agenteService.deleteAgent(ID);
    }
}
