package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoeamBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoeamBeautifier poeamBeautifier = new PoeamBeautifier();

        poeamBeautifier.beautify("Game of Thrones", (a) -> "ABC" + a + "ABC");
        poeamBeautifier.beautify("Game of thrones", (a) -> a.toUpperCase());
        poeamBeautifier.beautify("GAME OF THRONES", (a) -> a.toLowerCase());
        poeamBeautifier.beautify("GAME OF THRONES", (a) -> a.replace("O", "o"));
    }
}
