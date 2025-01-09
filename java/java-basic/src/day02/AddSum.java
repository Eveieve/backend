package day02;

import java.util.Scanner;

public class AddSum {

    public static void main(String[] args) {
        printSum();
    }

    public static int printSum() {
        int value = 10;
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        return num1 + value;
    }
}
