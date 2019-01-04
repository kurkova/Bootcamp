package com.kodilla.good.patterns.food2Door;

import java.util.List;

public class ProductOrderService {
    public static void main(String[] args) {
       OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
       List<OrderRequest> ordersRequest = orderRequestRetriever.retrieve();
       OrderProcessor orderProcessor = new OrderProcessor(new ShopOrderService(), new EmailInformationService());
       for(OrderRequest order: ordersRequest){
           orderProcessor.process(order);
       }
    }
}
