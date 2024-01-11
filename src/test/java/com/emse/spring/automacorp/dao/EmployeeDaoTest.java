package com.emse.spring.automacorp.dao;

import com.emse.spring.automacorp.model.Employee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class EmployeeDaoTest {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void shouldFindAnEmployeeById() {

        Optional<Employee> foundEmployee = employeeDao.findById(-1L);

        Assertions.assertThat(foundEmployee.isPresent()).isTrue();
        foundEmployee.ifPresent(employee -> {
            Assertions.assertThat(employee.getName()).isEqualTo("João Silva");
            Assertions.assertThat(employee.getEmail()).isEqualTo("joao.silva@example.com");
            Assertions.assertThat(employee.getRole()).isEqualTo("Gerente");
            Assertions.assertThat(employee.getPermission()).isEqualTo("Todas");
        });
    }
}
