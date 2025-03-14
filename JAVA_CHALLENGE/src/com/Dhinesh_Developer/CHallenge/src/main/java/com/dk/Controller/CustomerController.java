package com.dk.Controller;

import com.dk.Dto.CustomerDto;
import com.dk.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerDto> createEmployee(@RequestBody CustomerDto customerDto){
        return ResponseEntity.ok(customerService.createCustomer(customerDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable Integer id){
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    @GetMapping
    public ResponseEntity<List<CustomerDto>> getAllCustomerS(){
        return ResponseEntity.ok(customerService.getAllCustomer());
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable Integer id,@RequestBody CustomerDto customerDto){
        return ResponseEntity.ok(customerService.updateCustomer(id,customerDto));
    }

    @DeleteMapping
    public ResponseEntity<String> deleteCustomer(@PathVariable Integer id){
        customerService.deleteCustomer(id);
        return ResponseEntity.ok("Customer Deleted Successfully");
    }


}
