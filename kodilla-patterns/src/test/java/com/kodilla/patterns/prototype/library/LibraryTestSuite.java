package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //given
        Library adventureBooks = new Library("adventureBooks");
        IntStream.iterate(1,n->n+1)
                .limit(3)
                .forEach(n->adventureBooks.getBooks().add(new Book ("Adventure book no "+ n, "Author of this book: " + n, LocalDate.now().withMonth(n))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = adventureBooks.shallowCopy();
            clonedLibrary.setName("shallow copy of adventure books");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = adventureBooks.deepCopy();
            deepClonedLibrary.setName("deep copy of adventure books");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        clonedLibrary.getBooks().add(new Book ("new adventure book", "author", LocalDate.now()));
        deepClonedLibrary.getBooks().add(new Book ("new boring adventure book", "author", LocalDate.now()));
        deepClonedLibrary.getBooks().add(new Book ("another new boring adventure book", "author", LocalDate.now()));
        //When
        int result = adventureBooks.getBooks().size();
        int cloneResult = clonedLibrary.getBooks().size();
        int deepCloneResult = deepClonedLibrary.getBooks().size();
        //Then
        Assert.assertEquals(result,4);
        Assert.assertEquals(cloneResult,4);
        Assert.assertEquals(deepCloneResult,5);
    }
}
