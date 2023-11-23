package collections;

import java.util.Scanner;
import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<5; i++) {
            System.out.print("Enter a number: ");
            // Adding elements to the list
            list.add(scan.nextInt());
        }

        // Updating list capacity (Note: This is different from size of the list)
        list.ensureCapacity(10);

        // Removing elements
        list.remove(2);
        // Updating elements
        list.set(3, 4);

        // Iterating over the list
        for (int i=0; i<list.size(); i++) {
            // Printing list elements
            System.out.println("Number is: " + list.get(i));
        }
        scan.close();
    }
}
