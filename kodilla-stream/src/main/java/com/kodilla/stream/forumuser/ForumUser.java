package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final Integer uniqueNumber;
    private final String userName;
    private final char userSex;
    private final LocalDate dateOfBirth;
    private final int noOfPosts;

    public ForumUser(final Integer uniqueNumber, final String userName, final Character userSex, final LocalDate dateOfBirth, final Integer noOfPosts) {
        this.uniqueNumber = uniqueNumber;
        this.userName = userName;
        this.userSex = userSex;
        this.dateOfBirth = dateOfBirth;
        this.noOfPosts = noOfPosts;
    }
    public int getUniqueNumber() {
        return uniqueNumber;
    }
    public String getUserName() {
        return userName;
    }
    public char getUserSex() {
        return userSex;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public int getNoOfPosts() {
        return noOfPosts;
    }
    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueNumber=" + uniqueNumber +
                ", userName='" + userName +
                ", userSex=" + userSex +
                ", dateOfBirth=" + dateOfBirth +
                ", noOfPosts=" + noOfPosts +
                '}';
    }
}
