package com.emse.spring.automacorp.service;

import com.emse.spring.automacorp.dao.EmployeeDao;
import com.emse.spring.automacorp.dto.EmployeeDto;
import com.emse.spring.automacorp.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emse.spring.automacorp.model.Employee;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<EmployeeDto> findAll() {
        return employeeDao.findAll().stream()
                .map(EmployeeMapper::toDto)
                .collect(Collectors.toList());
    }

    public EmployeeDto findById(Long id) {
        Employee employee = employeeDao.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        return EmployeeMapper.toDto(employee);
    }

    public EmployeeDto create(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.toEntity(employeeDto);
        employee = employeeDao.save(employee);
        return EmployeeMapper.toDto(employee);
    }

    public EmployeeDto update(Long id, EmployeeDto employeeDto) {
        Employee employee = employeeDao.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        EmployeeMapper.updateEntity(employee, employeeDto);
        employee = employeeDao.save(employee);
        return EmployeeMapper.toDto(employee);
    }

    public void delete(Long id) {
        employeeDao.deleteById(id);
    }
}
