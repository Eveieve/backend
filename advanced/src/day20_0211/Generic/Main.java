package day20_0211.Generic;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();

        stringBox.setItem("doll1");
        stringBox.setItem("toy train");
        stringBox.setItem("bear doll");
        System.out.println(stringBox.getItem());

        //System.out.println(stringBox.);
    }
}
