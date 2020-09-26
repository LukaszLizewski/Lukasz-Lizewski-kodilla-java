package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "LISTNAME test";
    private static final String DESCRIPTION = "DESCRIPTION test";
    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);
        //When
        taskListDao.save(taskList);
        //Then
        String getListName = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(getListName);
        Assert.assertFalse(readTaskList.isEmpty());
        //CleanUp
        taskListDao.deleteAll();
    }
}
