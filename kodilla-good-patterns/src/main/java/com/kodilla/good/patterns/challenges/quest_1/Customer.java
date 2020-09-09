package com.kodilla.good.patterns.challenges.quest_1;

public class Customer {
    private String userName;
    private String name;
    private String lastName;
    private String address;
    private int telNo;

    public Customer(String userName, String name, String lastName, String address, int telNo) {
        this.userName = userName;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.telNo = telNo;
    }
    public String getUserName() {
        return userName;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public int getTelNo() {
        return telNo;
    }
}
