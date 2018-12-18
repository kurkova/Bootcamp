package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public class ProductOrderService {
    public static void main(String[] args) {
       OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve(new HashMap<>());
       orderRequestRetrieve.getOrders().put((new HealthyShop("LightFood")), new Salad("LightSalad",32.5));
       OrderRequest orderRequest = orderRequestRetrieve.retrievier();

       OrderProcesor orderProcesor = new OrderProcesor(new ShopOrderService(), new EmailInformationService());
       orderProcesor.process(orderRequest);
    }
}
