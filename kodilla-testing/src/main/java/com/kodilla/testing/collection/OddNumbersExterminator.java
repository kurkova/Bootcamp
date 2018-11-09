package com.kodilla.testing.collection;
import  java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int temporaryValue = numbers.get(i);
            if (temporaryValue % 2 == 0) {
                newList.add(temporaryValue);
            }
        }
        return newList;
    }
}
