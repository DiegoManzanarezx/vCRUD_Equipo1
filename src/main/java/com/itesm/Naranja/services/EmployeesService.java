package com.itesm.Naranja.services;

import com.itesm.Naranja.dto.EmployeesDTO;
import com.itesm.Naranja.models.Employees;
import com.itesm.Naranja.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.enhanced.dynamodb.Key;

@Service
public class EmployeesService {
    @Autowired
    EmployeesRepository employeesRepository;

    //CREATE
    public void createVideo(final EmployeesDTO employee){
        Employees e = new Employees();
        e.setEmployee_role(employee.getEmployee_role());
        e.setEmployee_id(employee.getEmployee_id());
        e.setEmployee_name(employee.getEmployee_name());
        e.setEmployee_email(employee.getEmployee_email());
        e.setEmployee_password(employee.getEmployee_password());
        e.setEmployee_num(employee.getEmployee_num());
        e.setAgent_num_calls(employee.getAgent_num_calls());
        e.setAgent_successful_tickets(employee.getAgent_successful_tickets());
        e.setAgent_unsuccessful_tickets(employee.getAgent_unsuccessful_tickets());
        e.setSupervisor_assigned_agents(employee.getSupervisor_assigned_agents());
        e.setManager_employees_list(employee.getManager_employees_list());

        employeesRepository.save(e);
    }

    //READ
    public Iterable<Employees> lista(){
        return employeesRepository.findAll();
    }
    public Iterable<Employees> get(String employee_role){
        return employeesRepository.findEmployee(employee_role);
    }
    public Employees getOne(String employee_role, String employee_id){
        return employeesRepository.findById(employee_role, employee_id);
    }

    //DELETE
    public void delete(String employee_role, String employee_id){
        employeesRepository.deleteById(employee_role, employee_id);
    }

    //UPDATE
    public Employees update(EmployeesDTO employee){

        Employees e = new Employees();
        e.setEmployee_role(employee.getEmployee_role());
        e.setEmployee_id(employee.getEmployee_id());
        e.setEmployee_name(employee.getEmployee_name());
        e.setEmployee_email(employee.getEmployee_email());
        e.setEmployee_password(employee.getEmployee_password());
        e.setEmployee_num(employee.getEmployee_num());
        e.setAgent_num_calls(employee.getAgent_num_calls());
        e.setAgent_successful_tickets(employee.getAgent_successful_tickets());
        e.setAgent_unsuccessful_tickets(employee.getAgent_unsuccessful_tickets());
        e.setSupervisor_assigned_agents(employee.getSupervisor_assigned_agents());
        e.setManager_employees_list(employee.getManager_employees_list());

        return employeesRepository.update(e);
    }
}
