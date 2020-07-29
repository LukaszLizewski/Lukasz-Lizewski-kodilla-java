package com.kodilla.extra;

public class StringCollection {
    private Element collectionHead = null;

    public void addElement(String s) {
        Element element = new Element(s);
        if (collectionHead == null) {
            collectionHead = element;
        } else {
            Element temp = collectionHead;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(element);
            element.setPrev(temp);
        }
    }
    public boolean removeElement(String s) {
        if (collectionHead.getValue() == s) {
            collectionHead = collectionHead.getNext();
            return true;
        } else {
            Element temp = collectionHead;
            while (temp.getNext().getValue() != s) {
                if (temp.getNext().getNext() != null) {
                    temp = temp.getNext();
                }else{
                    System.out.println("missing item");
                    return false;
                }
            }
            Element next = temp.getNext().getNext();
            if (next != null) {
                temp.setNext(next);
                next.setPrev(temp);
                return true;
            } else {
                temp.setNext(null);
                return true;
            }
        }
    }
    public void getElement(int n) {
        Element temp = collectionHead;
        int i =0;
        while (i != n){
            temp = temp.getNext();
            i++;
        }
        if (temp!=null) {
            System.out.println("get element position " + i + ": " + temp.getValue());
        } else {
            System.out.println("out of range");
        }
    }
    public void getDisplayAll(){
        System.out.println("head: "+collectionHead.getValue());
        Element tempDisplay = collectionHead;
        while (tempDisplay.getNext()!=null){
            tempDisplay=tempDisplay.getNext();
            System.out.println("next: "+tempDisplay.getValue());
        }
    }
}