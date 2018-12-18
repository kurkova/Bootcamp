package com.kodilla.good.patterns.Food2Door;

public class OrderProcesor {
    private OrderService orderService;
    private InformationService informationService;

    public OrderProcesor(final OrderService orderService, final InformationService informationService) {
        this.orderService = orderService;
        this.informationService = informationService;
    }
    public OrderDto process(final OrderRequest orderRequest){
        Boolean isOrdered = orderService.ordered(orderRequest.getShop(),orderRequest.getProduct(), orderRequest.getUser(),orderRequest.getQuantity());
        if(isOrdered){
            informationService.inform(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(),false);
        }
    }
}
