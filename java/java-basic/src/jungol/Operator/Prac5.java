package jungol.Operator;

import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 삼항연산자
        int res1 = (a == b) ? 1 : 0;
        int res2 = (b == c) ? 1 : 0;
        int res3 = (a != b) ? 1 : 0; // 같지 않으면
        int res4 = (b != c) ? 1 : 0;

        System.out.printf("%d %d %d %d", res1, res2, res3, res4);
    }

}
