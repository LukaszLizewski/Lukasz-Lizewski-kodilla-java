package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverQuest {
    private  final String mentorName;
    private int updateCount;
    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }
    @Override
    public void update(StudentQuest studentQuest) {
        System.out.println(mentorName + "; new task to be checked from:" + studentQuest.getStudentName() + "\n" +
                "No of tasks from "+ studentQuest.getStudentName() +" to be checked: " + studentQuest.getQuests().size()+"\n" +
                studentQuest.getQuests().toString());
        updateCount++;
    }
    public String getMentorName() {
        return mentorName;
    }
    public int getUpdateCount() {
        return updateCount;
    }
}
