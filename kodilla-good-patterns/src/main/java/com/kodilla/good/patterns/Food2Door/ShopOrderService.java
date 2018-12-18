package com.kodilla.good.patterns.Food2Door;

public class ShopOrderService implements OrderService {
    @Override
    public boolean ordered (Shop shop, Product product, User user, int quantity){
        if (product != null){
            System.out.print("New order for shop: " + shop.getName() + " ordered by: " + user.getName() +  " " + user.getLastName() +  ", product: " + product.getNameProduct() + " quantity: " + quantity + " for total price: " + product.getPrice()*quantity);
            return true;
        } else {
            System.out.print("Product is no available");
            return false;
        }
    }
}
