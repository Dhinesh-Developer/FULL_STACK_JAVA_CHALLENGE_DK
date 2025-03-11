package com.dk.Service;

import com.dk.Entity.Employee;
import com.dk.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {
       return  employeeRepository.findAll();
    }

    public void saveEmployee(Employee employee) {
         employeeRepository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    public void updateEmployee(Employee employee, int id) {
        Optional<Employee> employee1 = employeeRepository.findById(id);
        employee.setName(employee.getName());
        employee.setSalary(employee.getSalary());
        employee.setDomain(employee.getDomain());
        employeeRepository.save(employee);
    }
}
