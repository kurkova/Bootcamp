package com.kodilla.stream.beautifier;

public class PoeamBeautifier {
    public void beautify(String a, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(a);
        System.out.println(result);
    }
}
