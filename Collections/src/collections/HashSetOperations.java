/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetOperations {
    public static void main(String[] args) {
        // create a new HashSet
        Set<String> hashSet = new HashSet<>();

        // append elements to the HashSet
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");

        // iterate through all elements in the HashSet
        System.out.println("Iterating through hashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // convert HashSet to an array
        Object[] array = hashSet.toArray();
        System.out.println("Array elements: ");
        for (Object element : array) {
            System.out.println(element.toString());
        }

        // create a second HashSet
        Set<String> otherSet = new HashSet<>();
        otherSet.add("banana");
        otherSet.add("pear");
        otherSet.add("kiwi");

        // retain elements which are same on both sets
        hashSet.retainAll(otherSet);
        System.out.println("Intersection of hashSet and otherSet: " + hashSet);

        // remove all elements from HashSet
        hashSet.clear();
        System.out.println("After removing all elements, hashSet is empty: " + hashSet.isEmpty());
    }
}
