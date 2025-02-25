package com.fhc.principios.dip.versionbasica;

public class ProductCatalog {

    public void listAllProducts() {
        SQLProductRepository sqlProductRepository = new SQLProductRepository();
        sqlProductRepository.getAllProductNames();
        //List all products here
    }

}
