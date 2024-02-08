package org.example.entities;

public interface IProductService {
    default void sell(Product product, Customer customer) {

    }
}
