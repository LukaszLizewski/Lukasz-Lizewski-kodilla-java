package com.kodilla.spring.portfolio;

import com.kodilla.spring.shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getInProgressList().getTasks().add("work in progress");
        board.getToDoList().getTasks().add("work to do");
        board.getDoneList().getTasks().add("work has done");
        //When
        String result1 = (String) board.getInProgressList().getTasks().get(0);
        String result2 = (String) board.getToDoList().getTasks().get(0);
        String result3 = (String) board.getDoneList().getTasks().get(0);
        //Then
        Assert.assertEquals("work in progress", result1);
        Assert.assertEquals("work to do", result2);
        Assert.assertEquals("work has done", result3);
        System.out.println("Result InProgressList: " + result1 + '\n' +
                "Result ToDoList: " + result2 + '\n'+
                "Result DoneList: " + result3);
    }
}
