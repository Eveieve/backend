package jungol.Operator;

import java.util.Scanner;

public class Assess5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int res1 = (a == b) ? 1 : 0;
        int res2 = (a != b) ? 1 : 0;

        System.out.println(res1);
        System.out.println(res2);

    }
}