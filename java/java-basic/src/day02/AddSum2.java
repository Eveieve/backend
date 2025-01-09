package day02;

import java.util.Scanner;

public class AddSum2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int value = 10;
        sum += value; //????
        add(sum);
    }

    private static void add(int sum) {
        int input = sc.nextInt(); // static Scanner is in AddSum2 class
        sum += input;
        System.out.println(sum);
    }
}
