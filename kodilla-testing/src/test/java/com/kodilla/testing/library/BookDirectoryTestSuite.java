package com.kodilla.testing.library;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);

        assertTrue(true);
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        assertTrue(false);
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        assertTrue(false);
    }
}
