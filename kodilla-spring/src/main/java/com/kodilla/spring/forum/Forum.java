package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
class Forum {
    String username;

    public Forum() {
        this.username = "John Smith";
    }
}
