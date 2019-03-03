package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> booksFromLibraryA = new HashSet<>();
        booksFromLibraryA.add(new Book("Rowling",
                "Harry Potter I",
                2000,
                "AAA123"));
        booksFromLibraryA.add(new Book("Rowling",
                "Harry Potter II",
                2002,
                "AAA124"));
        booksFromLibraryA.add(new Book("Rowling",
                "Harry Potter III",
                2004,
                "AAA125"));
        booksFromLibraryA.add(new Book("Rowling",
                "Harry Potter IV",
                2006,
                "AAA126"));

        booksFromLibraryA.add(new Book("Rowling",
                "Harry Potter V",
                2008,
                "AAA127"));
        //When
        int median = medianAdapter.publicationYearMedian(booksFromLibraryA);
        //Then
        assertEquals(2004, median);
    }
}
