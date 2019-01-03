package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Main Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(3)
                .forEach(n -> library.getBooks().add(new Book("title" + n, "author" + n, LocalDate.of(1991 + n, 12 - n, 30 - n))));
        //When
        Library cloneLibrary = null;
        Library deepCloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            deepCloneLibrary = library.deepCopy();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //Then
        Assert.assertEquals(library.getBooks(), cloneLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(), deepCloneLibrary.getBooks());
    }
}
