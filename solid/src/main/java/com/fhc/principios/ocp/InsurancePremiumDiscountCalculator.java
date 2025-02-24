package com.fhc.principios.ocp;

public class InsurancePremiumDiscountCalculator {
    public int calculatePremiumDiscountPercent(CustomerProfile customer) {
        if(customer.isLoyalCustomer()) {
            return 20;
        }
        return 0;
    }
}
