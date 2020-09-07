package com.kodilla.good.patterns.challenges;

public class UserCustomer {
    private final String name;
    private final String lastName;
    private final String userName;
    private final String address;
    private final int telNo;

    public UserCustomer(String name, String lastName, String userName, String address, int telNo) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.address = address;
        this.telNo = telNo;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getUserName() {
        return userName;
    }
    public String getAddress() {
        return address;
    }
    public int getTelNo() {
        return telNo;
    }
}
