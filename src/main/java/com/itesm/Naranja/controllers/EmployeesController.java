package com.itesm.Naranja.controllers;
import com.itesm.Naranja.dto.EmployeesDTO;
import com.itesm.Naranja.models.Employees;
import com.itesm.Naranja.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/employees")
public class EmployeesController {

    @Autowired
    EmployeesService employeesService;

    @PostMapping("/save")
    public EmployeesDTO save(@RequestBody EmployeesDTO employee) throws Exception{
        employeesService.createVideo(employee);
        return employee;
    }

    @GetMapping("/all")
    public ResponseEntity<Iterable<Employees>> getAll(){
        return ResponseEntity.ok(employeesService.lista());
    }

    @GetMapping("/{employee_role}")
    public ResponseEntity<Iterable<Employees>> getOne(@PathVariable("employee_role") String employee_role){
        return ResponseEntity.ok(employeesService.get(employee_role));
    }

    @GetMapping("/{employee_role}/{employee_id}")
    public ResponseEntity<Employees> getOne(@PathVariable("employee_role") String employee_role, @PathVariable("employee_id") String employee_id){
        return ResponseEntity.ok(employeesService.getOne(employee_role, employee_id));
    }

    @DeleteMapping("/delete/{employee_role}/{employee_id}")
    public ResponseEntity<?> delete(@PathVariable("employee_role") String employee_role, @PathVariable("employee_id") String employee_id){
        employeesService.delete(employee_role, employee_id);
        return new ResponseEntity("persona eliminada", HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Employees> update(@RequestBody EmployeesDTO employee){
        return ResponseEntity.ok(employeesService.update(employee));
    }
}
