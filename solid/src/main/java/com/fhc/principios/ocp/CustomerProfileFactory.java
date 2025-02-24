package com.fhc.principios.ocp;

public class CustomerProfileFactory {
    public static CustomerProfile createCustomerProfile(String insuraceType) {
        switch (insuraceType) {
            case "HEALTH":
                return new HealthInsuranceCustomerProfile();
            case "HOME":
                return new HomeInsuranceCustomerProfile();
            case "VEHICLE":
                return new VehicleInsuranceCustomerProfile();
            default:
                throw new IllegalArgumentException("Tipo de seguro no válido: " + insuraceType);
        }
    }
}
