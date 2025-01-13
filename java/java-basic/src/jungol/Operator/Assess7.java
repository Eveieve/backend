package jungol.Operator;

import java.util.Scanner;

public class Assess7 {
    public static void main(String[] args) {

        // 전치 증가하고 출력
        // 후치감소 하고 출력
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int res1 = ++num1;
        int res2 = num2--;

        System.out.printf("%d %d\n", res1, num2);
        System.out.printf("%d %d", res1, res2);

    }
}
