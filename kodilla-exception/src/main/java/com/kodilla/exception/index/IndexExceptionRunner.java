package com.kodilla.exception.index;

import java.util.List;

public class IndexExceptionRunner {
    public static void main(String[] args) {
        VideoCollecton videoCollector = new VideoCollecton();
        List<String> collection = videoCollector.getCollection();

        if(collection.size() > 0) {
            String movie = collection.get(0);
            System.out.println(movie);

            String anotherMovie = collection.get(2);
            System.out.println(anotherMovie);
        }
    }
}
