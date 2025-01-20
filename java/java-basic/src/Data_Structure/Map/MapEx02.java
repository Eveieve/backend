package Data_Structure.Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx02 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        // Insert pairs in myMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Retrieve value by key
        System.out.println("Alice's age:" + map.get("Alice")); // 25

        // Check if a key exists
        if(map.containsKey("Bob")) {
            System.out.println("Bob's age is: " + map.get("Bob"));
        }

        // Remove a key-value pair
        map.remove("Charlie");

        // Iterate through the map
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        } //????????

        // Check if the map contains a value
        System.out.println("Contains age 30?: " +  map.containsValue(30));

        // Get the size of the map
        System.out.println("Size of map: " + map.size());// 2
    }
}
