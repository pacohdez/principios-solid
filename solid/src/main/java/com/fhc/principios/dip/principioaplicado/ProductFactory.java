package com.fhc.principios.dip.principioaplicado;

public class ProductFactory {

    public static ProductRepository create() {
        return new SQLProductRepository();
    }

}
