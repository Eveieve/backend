package day14_0203.Ex9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle());
        shapes.add(new Rectangle());
        shapes.add(new Rectangle());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Triangle());


        // arraylist 의 객체를 프린트.
        shapes.forEach(each -> System.out.println(each));
    }
}
