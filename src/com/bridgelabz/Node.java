package com.bridgelabz;


public class Node<K,V> {
    K key;
    V value;
    Node<K,V> next;

    public Node() {
    }

    public Node(K key, V value){
        this.key = key;
        this.value = value;
    }

    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("Node: " + " K= ").append(key).append(", V= ").append(value).append("\n");
        if (next != null)
            nodeString.append(" , ").append(next);
        return nodeString.toString();
    }
}
