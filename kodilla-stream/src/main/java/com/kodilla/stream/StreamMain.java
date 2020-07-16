package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import static jdk.nashorn.internal.objects.NativeString.trim;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("abc ", "more beautiful text", " abc", (a, b, c) -> a + b + c);
        poemBeautifier.beautify("==> ", "more beautiful text", " <==", (a, b, c) -> a + b + c);
        poemBeautifier.beautify("==> ", "more beautiful text", " <==", (a, b, c) -> b + c + a + b);
        poemBeautifier.beautify(":) ", "more beautiful text", " (:", (a, b, c) -> toUpperCase(a + b + c));
        poemBeautifier.beautify("abc ", "more beautiful text", " abc", (a, b, c) -> toUpperCase(a + b + c));
        poemBeautifier.beautify(" *** ", "more beautiful text", "", (a, b, c) -> toUpperCase(a + b + a));
    }
}
        /*
        System.out.println("Calculating expressions with lambdas:");
        expressionExecutor.executeExpression(10,5,(a, b) -> a+b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a-b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a*b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a/b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::subBfromA);

        System.out.println("LICZENIE ZA POMOCĄ METOD STATYCZNYCH NIEMUSIEJĄCYCH TWORZYC WłASNYCH OBIEKTÓW");
        System.out.println(FunctionalCalculator.addAToB(10,5));
        System.out.println(FunctionalCalculator.divideAByB(10,5));
        System.out.println(FunctionalCalculator.multiplyAByB(10,5));
        System.out.println(FunctionalCalculator.subBfromA(10,5));
         */

