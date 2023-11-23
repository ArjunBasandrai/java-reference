package collections;

import java.util.ArrayList;
import java.util.Collections;

public class singleton {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Phil");
        myList.add("Mary");
        myList.add("Betty");
        myList.add("Bob");
        System.out.println("Original: " + myList);
        myList.removeAll(Collections.singleton("Bob"));
        System.out.println("Removed: " + myList);
    }
}
