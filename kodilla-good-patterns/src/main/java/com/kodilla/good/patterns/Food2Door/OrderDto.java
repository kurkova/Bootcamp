package com.kodilla.good.patterns.Food2Door;

public class OrderDto {
    private User user;
    private boolean isOrdered;

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public OrderDto(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }
}
