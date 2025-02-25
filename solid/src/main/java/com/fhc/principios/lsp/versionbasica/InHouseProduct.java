package com.fhc.principios.lsp.versionbasica;

public class InHouseProduct extends Product {
    public void applyExtraDiscount() {
        discount = discount * 1.5;
    }
}
