package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collections_class {
    public static void main(String[] args) {
        String[] array = {"Phil", "Mary", "Betty", "bob"};
        List<String> myList = Arrays.asList(array); // asList() used to convert Array to List

        // Sorting 
        Collections.sort(myList);
        System.out.println("Sorted: " + myList);

        // Binary Search
        int where = Collections.binarySearch(myList, "bob");
        System.out.println("bob is at " + where);

        // Shuffling
        Collections.shuffle(myList);
        System.out.println("Shuffled: " + myList);

        // Reversing
        Collections.reverse(myList);
        System.out.println("Reversed: " + myList);
    }
}
