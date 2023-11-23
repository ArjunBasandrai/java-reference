package collections;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class hash_map {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        int size = scan.nextInt();

        // Adding elements to hash map
        for (int i=0; i<size; i++) {
            scan.nextLine();
            String key = scan.nextLine();
            int value = scan.nextInt();
            map.put(key, value);
        }

        // Checking if hash map is empty
        if (map.isEmpty()) {
            System.out.println("Hash map is empty");
            System.exit(0);
        } else {
            // Printing size of hash map
            System.out.println("Size of hash map is " + map.size());
        }

        // Traversing the map
        for (Map.Entry<String, Integer> entry: map.entrySet()) { // entrySet() returns a "Set" of type "Map.Entry" of all the entries
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Retrieving elements from hash map if it exists
        String get_key = scan.next();
        if (map.containsKey(get_key)) {
            System.out.println(map.get(get_key));
        }

        // Printing hash map
        System.out.println(map);

        // Removing elements from hash map if it exists
        String remove_key = scan.next();
        if (map.containsKey(remove_key)) {
            map.remove(remove_key);
        }

        // Printing keys of hash map
        System.out.println(map.keySet()); // returns a "Set" of keys

        // Printing values of hash map
        System.out.println(map.values()); // returns a "Collection" of values
    }
}
