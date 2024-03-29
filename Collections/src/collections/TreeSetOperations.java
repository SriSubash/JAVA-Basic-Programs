package collections;

import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        // create a new TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // add some colors (strings)
        treeSet.add("red");
        treeSet.add("blue");
        treeSet.add("green");

        // print out the tree set
        System.out.println("TreeSet elements: " + treeSet);

        // iterate through all elements in the tree set
        System.out.println("Iterating through treeSet:");
        for (String element : treeSet) {
            System.out.println(element);
        }

        // create a second TreeSet and add all elements from the first TreeSet
        TreeSet<String> anotherTreeSet = new TreeSet<>();
        anotherTreeSet.addAll(treeSet);
        System.out.println("anotherTreeSet after adding all elements from treeSet: " + anotherTreeSet);

        // get the element in the TreeSet which is greater than or equal to a given element
        String higherElement = treeSet.ceiling("orange");
        System.out.println("Element greater than or equal to 'orange': " + higherElement);

        // retrieve and remove the first element
        String firstElement = treeSet.pollFirst();
        System.out.println("First element in treeSet (removed): " + firstElement);
        System.out.println("TreeSet after removing first element: " + treeSet);
    }
}

