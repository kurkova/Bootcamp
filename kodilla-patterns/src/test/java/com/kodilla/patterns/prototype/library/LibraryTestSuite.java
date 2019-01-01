package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("First Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(3)
                .forEach(n -> library.getBooks().add(new Book("title" + n, "author" + n, LocalDate.of(1991 + n, 12 - n, 30 - n))));

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Secondary Library");

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Third Library");

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        //Then
        Assert.assertEquals(library.getBooks(), cloneLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(), deepCloneLibrary.getBooks());
    }
}
