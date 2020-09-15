package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("list1")
    private TaskList toDoList;
    @Autowired
    @Qualifier("list2")
    private TaskList inProgressList;
    @Autowired
    @Qualifier("list3")
    private TaskList doneList;

    @Bean (name = "board")
    public Board getBoardList(){
        return new Board(toDoList, inProgressList,doneList);
    }
    @Bean(name = "list1")
    @Scope("prototype")
    public TaskList setToDoList (){
        return new TaskList();
    }
    @Bean(name = "list2")
    @Scope("prototype")
    public TaskList setInProgressList (){
        return new TaskList();
    }
    @Bean(name = "list3")
    @Scope("prototype")
    public TaskList setDoneList (){
        return new TaskList();
    }

}
