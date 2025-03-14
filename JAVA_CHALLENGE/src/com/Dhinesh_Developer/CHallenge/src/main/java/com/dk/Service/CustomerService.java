package com.dk.Service;

import com.dk.Dto.CustomerDto;
import com.dk.Entity.Customer;
import com.dk.Entity.Employee;
import com.dk.Exception.ResourceNotFoundException;
import com.dk.Interface.CustomerInterfaces;
import com.dk.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService implements CustomerInterfaces {

    @Autowired
    private  CustomerRepository customerRepository;

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setPasswd(customerDto.getPasswd());
        Customer savedEmployee = customerRepository.save(customer);

        return convertToDTO(savedEmployee);
    }

    private CustomerDto convertToDTO(Customer customer) {
        return new CustomerDto(customer.getId(),customer.getName(),customer.getEmail(),customer.getPasswd());
    }

    @Override
    public CustomerDto getCustomerById(Integer id) {
      Customer customer = customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id is not present"));
        return convertToDTO(customer);
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        List<Customer> customers = customerRepository.findAll();
        return customers.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public CustomerDto updateCustomer(Integer id, CustomerDto customerDto) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer is not added"));
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setPasswd(customerDto.getPasswd());
        Customer savedCustomer = customerRepository.save(customer);
        return convertToDTO(savedCustomer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Failed to deleted the data"));
        customerRepository.delete(customer);
    }
}
