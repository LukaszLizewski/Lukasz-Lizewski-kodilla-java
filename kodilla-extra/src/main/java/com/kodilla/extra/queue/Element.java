package com.kodilla.extra.queue;

public class Element {
    private String value;
    private Element next = null;
    private Element prev = null;
    public Element(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    public Element getNext() {
        return next;
    }
    public Element getPrev() {
        return prev;
    }
    public void setNext(Element next) {
        this.next = next;
    }
    public void setPrev(Element prev) {
        this.prev = prev;
    }
}

