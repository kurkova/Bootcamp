package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private OrderService orderServices;
    private InformationService informationService;

    public OrderProcessor(final OrderService orderServices, final InformationService informationService) {
        this.orderServices = orderServices;
        this.informationService = informationService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderServices.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
