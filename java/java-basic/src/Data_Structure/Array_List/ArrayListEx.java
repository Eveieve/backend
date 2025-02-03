package Data_Structure.Array_List;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        // ArrayList<Type> mylist = new ArrayList<Type>();
        // ArrayList<Double> mydoublelist = new ArrayList<Double>();
        ArrayList<String> colors = new ArrayList<>();

        // Add Elements to an ArrayList
        colors.add("brown");
        colors.add("blue");
        colors.add("black");

        // Add elements at a specific position
        colors.add(5, "yellow");

        // Access elements
        String color = colors.get(1);
        String color2 = colors.get(5);

        // Modify elements
        colors.set(1, "white");

    }
}
