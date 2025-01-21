package day10_0121.package1; // let you know what package you are in

// this is another class A that's inside package 1.
public class A {

    // Declare fields
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("String literal");

    public A(){} // 실행문이 없어도 메모리에 공간 생김.

    public A(boolean b) {

    }

    // default constructor
    A(int j) {

    }
        // private constructor
    private A(String s) {

    }

}
