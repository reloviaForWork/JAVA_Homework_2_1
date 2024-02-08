package org.example;

import org.example.entities.*;

public class Main {
    public static void main(String[] args) {
        IProductService productService = new ProductManager(new HalkBankServiceAdapter());
        productService.sell(
                new Product(1,"Bilgisayar",40000),
                new Customer(1,"Yunus Emre",false,true)
        );
    }
}