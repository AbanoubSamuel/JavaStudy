package org.study.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void getBaseSalary() {
    }

    @Test
    void calcMethod() {
        Employee employee = new Employee();
        assertEquals(4, employee.calc(2, 2));
    }
}