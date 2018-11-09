package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
           Calculator calculator = new Calculator();

           int a = 8;
           int b = 6;

           int addResult = calculator.addAtoB(a,b);
           if (addResult == 14){
               System.out.println("Method of adding test ok");
           }else{
               System.out.println("Method of adding has Error");
           }

           int substractResult = calculator.substractAfromB(a,b);
           if (substractResult == 2){
               System.out.println("Method of substraction test Ok");
           }else{
               System.out.println("Method of substraction has error");
           }
    }
}
