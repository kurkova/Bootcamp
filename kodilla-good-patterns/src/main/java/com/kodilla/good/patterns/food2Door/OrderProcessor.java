package com.kodilla.good.patterns.food2Door;

public class OrderProcessor {
    private OrderService orderService;
    private InformationService informationService;

    public OrderProcessor(final OrderService orderService, final InformationService informationService) {
        this.orderService = orderService;
        this.informationService = informationService;
    }

    public OrderDto process(OrderRequest orderRequest) {
        Boolean isOrdered = orderService.ordered(orderRequest.getShop(), orderRequest.getProduct(), orderRequest.getUser(), orderRequest.getQuantity());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
