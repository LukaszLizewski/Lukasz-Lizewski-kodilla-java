package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = forum.getUserList().stream()
                .filter(user->user.getUserSex()=='M')
                .filter(user->user.getDateOfBirth().getYear()<= LocalDateTime.now().getYear()-20)
                .filter(user->user.getNoOfPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getUniqueNumber, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}





        /*
        PYTANIA
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("abc ", "more beautiful text", " abc", (a, b, c) -> a + b + c);
        poemBeautifier.beautify("==> ", "more beautiful text", " <==", (a, b, c) -> a + b + c);
        poemBeautifier.beautify("==> ", "more beautiful text", " <==", (a, b, c) -> b + c + a + b);
        poemBeautifier.beautify(":) ", "more beautiful text", " (:", (a, b, c) -> toUpperCase(a + b + c));
        poemBeautifier.beautify("abc ", "more beautiful text", " abc", (a, b, c) -> toUpperCase(a + b + c));
        poemBeautifier.beautify(" *** ", "more beautiful text", "", (a, b, c) -> toUpperCase(a + b + a));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas:");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBfromA);

        System.out.println("LICZENIE ZA POMOCĄ METOD STATYCZNYCH NIEMUSIEJĄCYCH TWORZYC WłASNYCH OBIEKTÓW");
        System.out.println(FunctionalCalculator.addAToB(10, 5));
        System.out.println(FunctionalCalculator.divideAByB(10, 5));
        System.out.println(FunctionalCalculator.multiplyAByB(10, 5));
        System.out.println(FunctionalCalculator.subBfromA(10, 5));
=======================
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
=======================
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book->book.getYearOfPublication()>2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));
        System.out.println(theResultStringOfBooks);
        */


