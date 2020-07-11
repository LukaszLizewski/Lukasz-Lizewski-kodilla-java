package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args){
        //Testing Calculator class
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 2;
        System.out.println("Firs unit test: add A="+a+" to B="+b);
        System.out.println("Result: "+ calculator.addAToB(a,b));
        if (a+b==calculator.addAToB(a,b)){
            System.out.println("Correct");
        } else {
            System.out.println("Not correct");
        }
        System.out.println("Second unit test: subtract B="+b+" from A="+a);
        System.out.println("Result: "+ calculator.subtractBFromA(a,b));
        if (a-b==calculator.subtractBFromA(a,b)){
            System.out.println("Correct");
        } else {
            System.out.println("Not correct");
        }
    }
}
