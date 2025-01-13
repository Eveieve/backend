package jungol.Operator;

import java.util.Scanner;

public class Assess6 {
    public static void main(String[] args) {
        // 4가지 관계연산자의 결과 출력하기.

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        boolean bool1 = num1 > num2;
        int int1 = bool1 ? 1 : 0;

        //boolean bool2 =
        System.out.printf("%d > %d --- %d", num1, num2, bool1);
    }
}
