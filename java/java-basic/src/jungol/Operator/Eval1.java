package jungol.Operator;

import java.util.Scanner;

public class Eval1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        int avg = sum / 5;

        System.out.printf("sum %d\navg %d", sum, avg);
    }
}
