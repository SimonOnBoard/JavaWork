package ru.itis.courses.schoolers.java.konkov.list_14;

import list.Elem;

import java.sql.Statement;

public class MyList<G> {
    private Node<G> head;
    private Node<G> tail;
    public MyList() {
        head = null;
        tail = head;
    }

    public Node getHead() {
        return head;
    }

    public void printAll() {
        Node current = head;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public void printAllReverseOrder() {
        Node current = tail;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getPrevious();
        }
    }


    public boolean add(G value) {
        Node<G> elem = new Node<>(value,null);
        if(head == null){
            head = elem;
            tail = head;
            return true;
        }
        tail.setNext(elem);
        elem.setPrevious(tail);
        tail = elem;
        return true;
    }
}
