package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void testMedianAdapter() {
        //Given
        Book book1 = new Book("TEST_author1", "TEST_title1", 1, "TEST_signature1");
        Book book2 = new Book("TEST_author2", "TEST_title2", 2, "TEST_signature2");
        Book book3 = new Book("TEST_author3", "TEST_title3", 3, "TEST_signature3");
        Book book4 = new Book("TEST_author4", "TEST_title4", 4, "TEST_signature4");
        Book book5 = new Book("TEST_author5", "TEST_title5", 5, "TEST_signature5");
        Set<Book> setOfBooks = new HashSet<>();
        setOfBooks.add(book1);
        setOfBooks.add(book2);
        setOfBooks.add(book3);
        setOfBooks.add(book4);
        setOfBooks.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int result = medianAdapter.publicationYearMedian(setOfBooks);
        //Then
        assertEquals(3,result);
    }
    @Test
    public void shouldBeZero() {
        //Given
        Set<Book> setOfBooks = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int result = medianAdapter.publicationYearMedian(setOfBooks);
        //Then
        assertEquals(0,result);
    }
}