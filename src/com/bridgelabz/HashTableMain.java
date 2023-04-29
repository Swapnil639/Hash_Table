package com.bridgelabz;

public class HashTableMain {
    public static void main(String[] args) {
        String sentence = "To be or not to be";

        HashTable<String, Integer> hashTable = new HashTable<>(6);

        String[] wordsArray = sentence.split(" ");
        for (String word : wordsArray) {
            Integer currentFrequency = hashTable.get(word);
            if (currentFrequency == null)
                currentFrequency = 1;
            else
                currentFrequency++;
            hashTable.addOrUpdate(word, currentFrequency);
        }

        System.out.println(hashTable);
    }
}
