package com.kodilla.spring.calculator;

import com.kodilla.spring.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(10,5);
        double resultSub = calculator.sub(10,5);
        double resultMul = calculator.mul(10,5);
        double resultDiv = calculator.div(10,5);
        //Then
        Assert.assertEquals(15,resultAdd,0.001);
        Assert.assertEquals(5,resultSub,0.001);
        Assert.assertEquals(50,resultMul,0.001);
        Assert.assertEquals(2,resultDiv,0.001);
    }
}
