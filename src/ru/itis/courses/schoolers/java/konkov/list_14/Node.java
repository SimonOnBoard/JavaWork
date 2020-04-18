package ru.itis.courses.schoolers.java.konkov.list_14;

public class Node<T> {
    private T value;
    private Node<T> next;
    private Node<T> previous;
    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(T value, Node next, Node previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
