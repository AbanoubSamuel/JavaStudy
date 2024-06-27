package org.study.oop;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateSalary(int extraHours) {
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base Salary should be greater than 0");
        }
        this.baseSalary = baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly rate should be greater than 0");
        }
        this.hourlyRate = hourlyRate;
    }
}
