package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentQuestTestSuite {
    @Test
    public void testUpdate () {
        //Given
        StudentQuest studentOne = new StudentQuest("Student no 1");
        StudentQuest studentTwo = new StudentQuest("Student no 2");
        StudentQuest studentThree = new StudentQuest("Student no 3");
        Mentor mentorOne = new Mentor("Mentor no 1");
        Mentor mentorTwo = new Mentor("Mentor no 2");
        studentOne.registerObserver(mentorOne);
        studentTwo.registerObserver(mentorOne);
        studentThree.registerObserver(mentorTwo);

        //When
        studentOne.addQuest("Quest no 1");
        studentOne.addQuest("Quest no 2");
        studentTwo.addQuest("Quest no 1");
        studentThree.addQuest("Quest no 1");
        studentThree.addQuest("Quest no 2");
        studentThree.addQuest("Quest no 3");
        //Then
        assertEquals(3,mentorOne.getUpdateCount());
        assertEquals(3,mentorTwo.getUpdateCount());

    }
}
