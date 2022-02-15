package com.javaassignment10;

public class SList {

    Node head;
    @Override
    public String toString() {
        return "head=" + head;
    }

    public SListIterator iterator()
    {
        return new SListIterator(this);
    }
}
