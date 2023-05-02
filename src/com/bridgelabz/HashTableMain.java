package com.bridgelabz;

public class HashTableMain {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        HashTable<String, Integer> hashTable = new HashTable<>(6);
        String[] wordsArray = paragraph.split(" ");
        for (String word : wordsArray) {
            Integer currentFrequency = hashTable.get(word);
            if (currentFrequency == null)
                currentFrequency = 1;
            else
                currentFrequency++;
            hashTable.addOrUpdate(word, currentFrequency);
        }
        hashTable.searchAndRemove("avoidable", 1);
        System.out.println(hashTable);


    }
}
