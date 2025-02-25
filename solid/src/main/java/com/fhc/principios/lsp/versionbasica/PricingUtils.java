package com.fhc.principios.lsp.versionbasica;

import java.util.ArrayList;
import java.util.List;

public class PricingUtils {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new InHouseProduct();

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        for(Product product : productList) {
            //No se aplica el segundo patrón del problema "Tell, don't ask"
            //Aquí no debe de realizarse la pregunta o el if de que tipo es, se deberá aplicar el principio LSP
            if(product instanceof InHouseProduct) {
                ((InHouseProduct) product).applyExtraDiscount();
            }
            System.out.println(product.getDiscount());
        }
    }
}
