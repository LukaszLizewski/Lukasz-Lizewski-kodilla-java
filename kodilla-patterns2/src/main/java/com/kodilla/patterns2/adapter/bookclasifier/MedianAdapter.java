package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookMap = bookSet.stream()
                .collect(Collectors.toMap(
                        e->new BookSignature (e.getSignature()),
                        e->new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                                e.getAuthor(),
                                e.getTitle(),
                                e.getPublicationYear())));
        return medianPublicationYear(bookMap);
    }
}
