package org.study.ultimate.oop.dependancyInjection;

public class TaxReport {
    TaxCalculator taxCalculator;

    public TaxReport(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void show() {
        double calculatedTax = taxCalculator.calculateTax();
        System.out.println(calculatedTax);
    }
}