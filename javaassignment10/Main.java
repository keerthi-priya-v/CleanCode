package com.javaassignment10;

public class Main {

    public static void main(String[] args){

        SListIterator linkedList = new SListIterator(new SList());
        linkedList.insert(16);
        linkedList.insert(24);
        linkedList.insert(7);
        linkedList.insert(38);
        linkedList.insert(93);
        linkedList.insert(42);
        System.out.println("Linked List after insertion :");
        linkedList.printList();
        System.out.println();
        linkedList.delete(38);
        linkedList.delete(24);
        System.out.println("Linked List after deletion :");
        linkedList.printList();
        System.out.println();

    }
}
