package main.java.com.dogie.algorithms.datastructures.linkedlist;

public class DoubleLinkedList<T> implements LinkedList<T> {
    private Node<T> front = null;
    private Node<T> back = null;


    private static class Node<T> {
        private T value;
        private Node<T> prev, next;

        public Node(T value, Node<T> prev, Node<T> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public void insertAfter(Node<T> a, Node<T> x) {
        Node<T> b = a.next;
        x.prev = a;
        x.next = b;
        a.next = x;
        b.prev = x;
    }
}
