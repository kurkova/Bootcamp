package com.kodilla.good.patterns.food2Door;

public class OrderRequest {
    private Shop shop;
    private Product product;
    private User user;
    private int quantity;

    public OrderRequest(Shop shop, Product product, User user, int quantity) {
        this.shop = shop;
        this.product = product;
        this.user = user;
        this.quantity = quantity;
    }

    public Shop getShop() {
        return shop;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public int getQuantity() {
        return quantity;
    }
}
