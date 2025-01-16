package day07.note;

import java.util.Scanner;

class Car{
    String color;
    void colorReturn(){
        System.out.println("Color of the car is " + color);
    }
}
public class Test {
    public static void main(String[] args) {
        int number =1;
        Scanner sc = new Scanner(System.in);

        Car car1 = new Car();
        Car car2 = new Car();

//        System.out.println(number);
//        System.out.println(sc.getClass().getName());
//        System.out.println(sc.toString());
//        System.out.println(car1.toString());

        car1.color = "read";
        car2.color = "blue";
        System.out.println(car1.color); // Q. color 값을 참조하여 복사한다? 가 맞는말인가
        System.out.println(car2.color);
    }
}
