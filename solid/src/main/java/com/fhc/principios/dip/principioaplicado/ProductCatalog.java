package com.fhc.principios.dip.principioaplicado;

import java.util.List;

public class ProductCatalog {

    private ProductRepository productRepository;

    public ProductCatalog(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void listAllProducts() {
        /* ProductRepository productRepository = ProductFactory.create();
        productRepository.getAllProductNames(); */
        //List all products here

        List<String> allProductNames = productRepository.getAllProductNames();
        System.out.println(allProductNames);
    }

}
