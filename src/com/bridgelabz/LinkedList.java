package com.bridgelabz;

public class LinkedList<K,V> {
    Node<K, V> head;
    Node<K, V> tail;

    public void add(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node<K, V> search(K searchData) {
        Node<K, V> temp = head;
        while (temp != null) {
            if (temp.key.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    @Override
    public String toString() {
        return " \n{" + head + "}";
    }
}
