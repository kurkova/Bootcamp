package com.kodilla.good.patterns.challenges;

public class LaptopOrderService implements OrderService {
    @Override
    public boolean order(User user, Product product, int quantity) {
        if (product != null) {
            System.out.println("Product " + product.getNameProduct() + " ordered by " + user.getName() + " " + user.getLastName() + " quantity :" + quantity + " for total price: " + product.getPrice() * quantity);
            return true;
        } else {
            return false;
        }
    }
}