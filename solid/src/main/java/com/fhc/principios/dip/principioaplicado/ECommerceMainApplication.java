package com.fhc.principios.dip.principioaplicado;

public class ECommerceMainApplication {

    public static void main(String[] args) {
        ProductRepository productRepository = ProductFactory.create();

        ProductCatalog productCatalog = new ProductCatalog(productRepository);

        productCatalog.listAllProducts();
    }

}
