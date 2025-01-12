package jungol.Operator;

import java.util.Scanner;

public class Assess4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        c = ++a + b--;

        System.out.printf("a = %d, b = %d, c = %d", a, b, c);
    }

}
