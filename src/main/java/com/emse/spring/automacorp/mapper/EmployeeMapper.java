package com.emse.spring.automacorp.mapper;

import com.emse.spring.automacorp.dto.EmployeeDto;
import com.emse.spring.automacorp.model.Employee;

public class EmployeeMapper {

    public static EmployeeDto toDto(Employee employee) {
        EmployeeDto dto = new EmployeeDto();
        dto.setEmployeeId(employee.getEmployeeId());
        dto.setName(employee.getName());
        dto.setEmail(employee.getEmail());
        dto.setPassword(employee.getPassword());
        dto.setRole(employee.getRole());
        dto.setPermission(employee.getPermission());
        return dto;
    }

    public static Employee toEntity(EmployeeDto dto) {
        Employee employee = new Employee();
        employee.setEmployeeId(dto.getEmployeeId());
        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setPassword(dto.getPassword());
        employee.setRole(dto.getRole());
        employee.setPermission(dto.getPermission());
        return employee;
    }

    public static void updateEntity(Employee employee, EmployeeDto dto) {
        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setPassword(dto.getPassword());
        employee.setRole(dto.getRole());
        employee.setPermission(dto.getPermission());
    }
}
