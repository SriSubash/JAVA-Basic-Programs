package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListOperations {
    public static void main(String[] args) {
        // create a new ArrayList
        List<String> colors = new ArrayList<>();

        // add some colors to the ArrayList
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        // print out the collection
        System.out.println("Colors: " + colors);

        // iterate through all elements in the ArrayList
        System.out.println("Iterating through colors:");
        for (String color : colors) {
            System.out.println(color);
        }
        Iterator itr=colors.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        // retrieve an element (at a specified index) from the ArrayList
        int index = 1;
        String colorAtIndex = colors.get(1);
        System.out.println("Element at index " + index + ": " + colorAtIndex);

        // copy one ArrayList into another
        List<String> newColors = new ArrayList<>(colors);
        System.out.println("New colors: " + newColors);

        // join two ArrayLists
        List<String> moreColors = Arrays.asList("yellow", "purple");
        List<String> allColors = new ArrayList<>(colors);
        allColors.addAll(moreColors);
        System.out.println("All colors: " + allColors);
    }
}
