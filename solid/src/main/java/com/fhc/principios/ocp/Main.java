package com.fhc.principios.ocp;

public class Main {
    public static void main(String[] args) {
        //Tipo de seguro que se obtiene de alguna lógica de negocio
        String insuranceType = "HEALTH";
        // Usamos el factory para crear el perfil correcto
        CustomerProfile customerProfile = CustomerProfileFactory.createCustomerProfile(insuranceType);

        // O puede ser a través del uso de polimorfismo
        // CustomerProfile customerProfile = new HealthInsuranceCustomerProfile();

        //Calculamos el descuento
        InsurancePremiumDiscountCalculator calculator = new InsurancePremiumDiscountCalculator();
        int discount = calculator.calculatePremiumDiscountPercent(customerProfile);
        System.out.println("Descuento aplicado: " + discount + "%");
    }
}
