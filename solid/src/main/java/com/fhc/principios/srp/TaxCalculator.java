package com.fhc.principios.srp;

public class TaxCalculator {
    public void calculateTax(Employee employee) {
        if(employee.getEmployeeType().equals("fulltime")) {
            // Tax calc for full time employee
        }
        if(employee.getEmployeeType().equals("contract")) {
            // Tax calc for contractors employee
        }
    }
}
