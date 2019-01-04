package com.kodilla.good.patterns.food2Door;

import java.util.*;

public class OrderRequestRetriever {
    private List<OrderRequest> ordersList = new ArrayList<>();

    public List<OrderRequest> retrieve() {
        Shop shop1 = new Shop("HealthyShop");
        Product product1 = new Product("Fish", 2.5);
        User user1 = new User("Paul", "John", "paulaJohn@wp.pl");
        int quantity1 = 2;
        ordersList.add(new OrderRequest(shop1, product1, user1, quantity1));

        Shop shop2 = new Shop("GlutenFree");
        Product product2 = new Product("Pasta", 3.24);
        User user2 = new User("Mark", "Sit", "sitMark@wp.pl");
        int quantity2 = 3;
        ordersList.add(new OrderRequest(shop2, product2, user2, quantity2));
        return new ArrayList<>(ordersList);
    }
}
