package day02;

import java.util.Scanner;

public class TotalEx01 {
    //멤버변수
    static Scanner input = new Scanner(System.in);
    //실행 메서드
    public static void main(String[] args) {
    operator();
    }
    //Methods
    static void fourArithemetic() {
        System.out.printf("Enter first number.");
        int a = input.nextInt();
        System.out.printf("Second number plesase. ");
        int b = input.nextInt();

    }

    static void operator() {
        System.out.println("Kor score: ");
        int kor = input.nextInt();
        System.out.println("Eng score: ");
        int eng = input.nextInt();
        int total = 0;
        double average = 0.0;

        total = kor + eng;
        average = total/2.0;

        System.out.printf("Total is:%d%n" + total);
        System.out.printf("Average is is:%f" + average);
    }

}
