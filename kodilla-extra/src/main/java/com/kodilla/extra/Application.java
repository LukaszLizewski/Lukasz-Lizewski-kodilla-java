package com.kodilla.extra;

public class Application {
    public static void main(String args[]) {
        StringCollection stringCollection = new StringCollection();
        stringCollection.addElement("1");
        stringCollection.addElement("2");
        stringCollection.addElement("3");
        stringCollection.addElement("4");
        stringCollection.addElement("5");
        stringCollection.addElement("6");
        stringCollection.addElement("7");
        stringCollection.addElement("8");
        stringCollection.addElement("9");
        stringCollection.addElement("10");
        stringCollection.removeElement("10");
        stringCollection.removeElement("3");
        stringCollection.removeElement("2");
        stringCollection.removeElement("1");
        stringCollection.removeElement("9");
        stringCollection.removeElement("6");
        stringCollection.removeElement("11");
        stringCollection.getElement(0);
        stringCollection.getElement(1);
        stringCollection.getElement(2);
        stringCollection.getElement(3);
        stringCollection.getElement(4);
        stringCollection.getDisplayAll();
    }
}
