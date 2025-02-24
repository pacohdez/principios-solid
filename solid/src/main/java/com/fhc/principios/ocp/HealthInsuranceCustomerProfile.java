package com.fhc.principios.ocp;

import java.util.Random;

public class HealthInsuranceCustomerProfile implements CustomerProfile {
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
