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

        boolean bool2 = num1 < num2;
        int int2 = bool2 ? 1 :0;

        boolean bool3 = num1 >= num2;
        int int3 = bool3 ? 1 :0;

        boolean bool4 = num1 <= num2;
        int int4  = bool4 ? 1 :0;
        System.out.printf("%d > %d --- %d\n", num1, num2, int1);
        System.out.printf("%d < %d --- %d\n", num1, num2, int2);
        System.out.printf("%d >= %d --- %d\n", num1, num2, int3);
        System.out.printf("%d <= %d --- %d", num1, num2, int4);


    }
}
