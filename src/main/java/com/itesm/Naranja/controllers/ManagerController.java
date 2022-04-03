package com.itesm.Naranja.controllers;

import com.itesm.Naranja.models.Manager;
import com.itesm.Naranja.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ManagerController {
    @Autowired
    ManagerService managerService;

    @RequestMapping(
            value = "/v1/manager/allManagers",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseBody
    public List<Manager> getAllManagers(){
        return managerService.getAllManagers();
    }


    @RequestMapping(
            value = "/v1/manager/update",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseBody
    public void updateManagerName(){
    }


    @RequestMapping(
            value = "/v1/manager/searchByID",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseBody
    public Manager getManagerByID(String ID){
        return managerService.getManagerByID(ID);
    }


    @RequestMapping(
            value = "/v1/manager/save",
            method = RequestMethod.POST,
            produces = "application/json"
    )
    @ResponseBody
    public Manager save(@RequestBody Manager manager){
        managerService.insertManager(manager);
        System.out.println(manager.toString());
        return manager;
    }


    @RequestMapping(
            value = "/v1/manager/delete/{ID}",
            method = RequestMethod.DELETE,
            produces = "application/json"
    )
    @ResponseBody
    public void deleteManager(@PathVariable("ID") String ID){
        managerService.deleteManager(ID);
    }
}
