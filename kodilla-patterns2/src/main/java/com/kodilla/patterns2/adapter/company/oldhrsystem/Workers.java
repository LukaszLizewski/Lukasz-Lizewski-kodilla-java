package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [] [] workers = {
            {"123456789", "John", "Smith"},
            {"987654321", "Ivan", "Novak"},
            {"192837465", "Jessie", "Pinkman"},
            {"564738291", "Walter", "White"},
            {"981237465", "Clara", "Lanson"}};
    private double [] salaries = {
            4500.00,
            3700.00,
            5600.00,
            9000.00,
            6200.00};
    public String getWorker(int n) {
        if (n>salaries.length) {
            return "";
        }
        return workers [n] [0] + ", " + workers [n] [1] + ", " + workers [n] [2] + ", " + salaries [n];
    }
    public String [] [] getWorkers() {
        return workers;
    }
    public double [] getSalaries() {
        return salaries;
    }

}
