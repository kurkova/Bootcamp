package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Paul", "John", "john@wp.pl");
        Product product = new Product("Laptop Lenovo", 1200.0);
        int quantity = 3;
        return new OrderRequest(user, product, quantity);
    }
}
