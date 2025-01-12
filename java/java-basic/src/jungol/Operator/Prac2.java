package jungol.Operator;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("5개의 수를 입력하시오.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        int res1 = num1 + 3;
        int res2 = num2 - 3;
        int res3 = num3 * 3;
        int res4 = num4 / 3;
        int res5 = num5 % 3;

        System.out.printf("%d %d %d %d %d", res1, res2, res3, res4, res5);
    }


}
