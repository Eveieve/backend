package Data_Structure.Map;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        // A LinkedHashMap maintains the insertion order of elements.
        // HashMap does not gurantee any order of keys.

        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "john");
        map.put("second", "jane");
        map.put("third", "doe");

        // Iterate through the map
        // Order will be based on insertion
        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // first: john
        // second: jane
        // third: doe
    }
}
