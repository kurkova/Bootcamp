package com.kodilla.spring.calculator;

import org.springframework.stereotype.Service;

@Service
public final class Calculator {
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double resultAdd = a + b;
        display.displayValue(resultAdd);
        return resultAdd;
    }

    public double sub(double a, double b) {
        double resultSub = a - b;
        display.displayValue(resultSub);
        return resultSub;
    }

    public double mul(double a, double b) {
        double resultMul = a * b;
        display.displayValue(resultMul);
        return resultMul;
    }

    public double div(double a, double b) {
        double resultDiv = a / b;
        display.displayValue(resultDiv);
        return resultDiv;
    }
}

