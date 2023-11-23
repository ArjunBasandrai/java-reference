package collections;

import java.util.Scanner;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;

public class collection_class {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // String Collection
        Collection<String> myCollection = new ArrayList<String>();
        myCollection.add("Phil");
        myCollection.add("Mary");
        myCollection.add("Betty");
        myCollection.add("Bob");
        printAll(myCollection);

        // Integer Collection
        Collection<Integer> intCollection = new ArrayList<Integer>();
        intCollection.add(12);
        intCollection.add(56);
        intCollection.add(23);
        intCollection.add(76);
        printAll(intCollection);

        scan.close();
    }

    static <T> void printAll(Collection<T> coll) {
        Iterator<T> iter = coll.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
