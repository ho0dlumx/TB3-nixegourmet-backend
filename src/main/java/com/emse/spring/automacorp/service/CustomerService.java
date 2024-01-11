package com.emse.spring.automacorp.service;

import com.emse.spring.automacorp.dao.CustomerDao;
import com.emse.spring.automacorp.dto.CustomerDto;
import com.emse.spring.automacorp.mapper.CustomerMapper;
import com.emse.spring.automacorp.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public List<CustomerDto> findAll() {
        return customerDao.findAll().stream()
                .map(CustomerMapper::toDto)
                .collect(Collectors.toList());
    }

    public CustomerDto findById(Long id) {
        Customer customer = customerDao.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
        return CustomerMapper.toDto(customer);
    }

    public CustomerDto create(CustomerDto customerDto) {
        Customer customer = CustomerMapper.toEntity(customerDto);
        customer = customerDao.save(customer);
        return CustomerMapper.toDto(customer);
    }

    public CustomerDto update(Long id, CustomerDto customerDto) {
        Customer customer = customerDao.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
        CustomerMapper.updateEntity(customer, customerDto);
        customer = customerDao.save(customer);
        return CustomerMapper.toDto(customer);
    }

    public void delete(Long id) {
        customerDao.deleteById(id);
    }
}

