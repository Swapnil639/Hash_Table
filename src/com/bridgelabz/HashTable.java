package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HashTable<K,V> {
    int bucketSize;

    List<LinkedList<K,V>> bucketArray = new ArrayList<>(bucketSize);

    public HashTable() {

    }

    public HashTable(int bucketSize) {
        this.bucketSize = bucketSize;
        for (int i = 0; i < bucketSize; i++) {
            bucketArray.add(i, null);
        }
    }

    public int getIndex(K key) {
        int index = Math.abs(key.hashCode()) % bucketSize;
        return index;
    }

    public void addOrUpdate(K key, V value) {
        int index = getIndex(key);
        LinkedList<K,V> linkedList = bucketArray.get(index);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            bucketArray.add(index, linkedList);
            linkedList.add(key, value);
        } else {
            Node<K, V> currentNode = linkedList.search(key);
            if(currentNode != null)
                currentNode.value = value;
            else
                linkedList.add(key, value);
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        LinkedList<K, V> linkedList = bucketArray.get(index);
        if (linkedList == null)
            return null;
        Node<K, V> currentNode = linkedList.search(key);
        return currentNode != null ? currentNode.value : null;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "bucketArray=" + bucketArray +
                '}';
    }
}
