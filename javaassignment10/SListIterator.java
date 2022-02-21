package com.javaassignment10;

public class SListIterator {
    SList list;
    public SListIterator(SList head)
    {
        list=head;
    }

    public  void insert( int data)
    {

        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public  void delete(int key)
    {
        Node currentNode = list.head, prev = null;

        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;
            System.out.println(key + " found and deleted");
            return;
        }
        while (currentNode != null && currentNode.data != key) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode.data == key) {
            currentNode = currentNode.next;
            prev.next = currentNode;

            System.out.println(key + " found and deleted");
            return;
        }
        if (currentNode == null) {
            System.out.println(key + " not found");
        }
        return ;
    }
    public void printList()
    {
        Node node = list.head;
        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
