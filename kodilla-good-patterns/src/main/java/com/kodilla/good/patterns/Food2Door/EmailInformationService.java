package com.kodilla.good.patterns.Food2Door;

public class EmailInformationService implements InformationService {
    @Override
    public void inform(User user){
        System.out.println("Sending message about order to: " + user.getName() + user.getLastName() + user.getEmail());
    }
}
