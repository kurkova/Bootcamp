package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;

public class ProductOrderService {
    public static void main(String[] args) {
       OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever(new HashMap<>());
       orderRequestRetriever.getOrders().put((new HealthyShop("HealthyShop")), new Salad("LightSalad",32.5));
       OrderRequest orderRequest = orderRequestRetriever.retrievier();

       OrderProcessor orderProcessor = new OrderProcessor(new ShopOrderService(), new EmailInformationService());
       orderProcessor.process(orderRequest);
    }
}
