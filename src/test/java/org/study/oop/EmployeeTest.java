package org.study.oop;

import org.junit.jupiter.api.Test;
import org.study.ultimate.oop.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void getBaseSalary() {
    }

    @Test
    void calcBaseSalaryMethod() {
        Employee employee = new Employee();
        assertEquals(4, employee.calcBaseSalary(2, 2));
    }
}