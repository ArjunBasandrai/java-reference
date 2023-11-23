package collections;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class bulk_ops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // populating collections
        for (int i=0; i<5; i++) {
            list.add(i);
            list2.add(i);
            map.put(Integer.toString(i), i);
        }
        // containsAll method checks if all elements of a collection are present in another collection
        System.out.println(list.containsAll(list2));
        
        // removeAll method removes all elements of a collection from another collection
        list.removeAll(map.values());
        System.out.println(list);

        // addAll method adds all elements of a collection to another collection
        list.addAll(map.values());
        System.out.println(list);

        // retainAll method retains all elements of a collection in another collection
        list2.remove(3);
        list.retainAll(list2);
        System.out.println(list);

        // clear method clears a collection
        list.clear();
        System.out.println(list);

        // toArray method converts a collection to an array
        Integer[] arr = list2.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr)); // using Arrays.toString to print array because printing array directly prints its hashcode represention

        scan.close();
    }
}
