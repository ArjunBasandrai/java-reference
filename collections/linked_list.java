package collections;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class linked_list {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();

        int size = scan.nextInt();
        for (int i = 0 ; i < size; i++) {
            System.out.print("Enter a string: ");
            // Adding elements to the list
            list.add(scan.next());
        }

        // Printing the size of the list
        System.out.println("Size of the list: " + list.size());

        // Removing elements
        list.remove("B");
        // Removing elements by index
        list.remove(2);
        
        // Printing the list
        System.out.println(list);


        // Printing the first and last element
        System.out.println(list.element()); // .element() returns the first element
        System.out.println(list.getFirst()); // .getFirst() returns the first element
        System.out.println(list.getLast()); // .getLast() returns the last element

        // Printing using iterator
        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        scan.close();
    }
}
