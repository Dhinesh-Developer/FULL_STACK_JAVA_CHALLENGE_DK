package com.dk.Controller;

import com.dk.Entity.Employee;
import com.dk.Service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeService employeService;

    @GetMapping("/spring")
    public String getUrl(){
        return "Welcome to spring boot Application using the REST API";
    }

    @GetMapping("/emp")
    public List<Employee> getEmployee(){
        List<Employee> employee = employeService.getAllEmployee();
        return employee;
    }

    @PostMapping("/emp")
    public String postEmployeeDetails(@RequestBody Employee employee){
        employeService.saveEmployee(employee);
        return "Data saved";
    }

    @DeleteMapping("empl/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        employeService.deleteEmployee(id);
    }

    @PutMapping("emp/{id}")
    public void updateEmployee(@RequestBody Employee employee,int id){
        employeService.updateEmployee(employee,id);
    }
}
