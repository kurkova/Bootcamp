package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetrieve {
    private HashMap<Shop, Product> orders;

    public OrderRequestRetrieve(HashMap<Shop, Product> orders) {
        this.orders = orders;
    }
    public HashMap<Shop, Product> getOrders() {
        return orders;
    }

    public OrderRequest retrievier() {
        Shop shop = null;
        Product product = null;
        User user = new User("Paul", "John", "paulaJohn@wp.pl");
        int quantity = 2;

        for (Map.Entry<Shop, Product> map : orders.entrySet()) {
            shop = map.getKey();
            product = map.getValue();
        }
        return new OrderRequest(shop, product, user, quantity);
    }
}
