package com.dk.Interface;

import com.dk.Dto.CustomerDto;

import java.util.List;

public interface CustomerInterfaces {
    CustomerDto createCustomer(CustomerDto customerDto);
    CustomerDto getCustomerById(Integer id);
    List<CustomerDto> getAllCustomer();
    CustomerDto updateCustomer(Integer id,CustomerDto customerDto);
    void deleteCustomer(Integer id);
}
