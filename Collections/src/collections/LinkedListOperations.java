/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        // create a new LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // append elements to the end of the LinkedList
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");

        // iterate through all elements in the LinkedList
        System.out.println("Iterating through linkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // iterate through the LinkedList in reverse order
        System.out.println("Iterating through linkedList in reverse order:");
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.println(linkedList.get(i));
        }

        // get the first and last occurrence of the specified elements
        String firstOccurrence = linkedList.getFirst();
        String lastOccurrence = linkedList.getLast();
        System.out.println("First occurrence: " + firstOccurrence);
        System.out.println("Last occurrence: " + lastOccurrence);

        // shuffle the elements in the LinkedList
        Collections.shuffle(linkedList);
        System.out.println("Shuffled LinkedList: " + linkedList);
    }
}
