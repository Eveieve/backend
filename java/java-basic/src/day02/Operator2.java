package day02;

import java.util.Scanner;

public class Operator2 {
    public static void main(String[] args) {
        // 어떤 데이터를 쓸것이냐
        // 저장해야 할 데이터들은 선언, 초기화 해야 함.
        int kor = 77;
        int eng = 87;
        int total = 0;
        int average = 0;

        total = kor + eng;
        average = total/2;

        System.out.printf("Total is:%d%n" + total);
        System.out.printf("Average is is:%d" + average);


    }
}
