package Data_Structure.Map;

import java.util.Map;
import java.util.TreeMap;

// TreeMap automatically sorts the keys.
// The keys are sorted in alphabetical order.

public class TreeMapEx {
    public static void main(String[] args) {
        // a TreeMap automatically sorts the keys in their natural order (for comparable types) or using a comparator

        // Create a TreeMap
        Map<String, Integer> map = new TreeMap<>();

        map.put("apple", 10);
        map.put("banana", 5);
        map.put("mango", 15);

        // Iterate through the treemap. keys are in sorted order.
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

        // sorted by key:
        // apple: 10
        // banana: 5
        // mango: 15
    }
}
