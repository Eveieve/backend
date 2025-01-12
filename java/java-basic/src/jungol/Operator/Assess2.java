package jungol.Operator;

import java.util.Scanner;

public class Assess2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int res1 = num1 + 100;
        int res2 = num2 % 10;

        System.out.printf("%d %d", res1, res2);
    }
}
