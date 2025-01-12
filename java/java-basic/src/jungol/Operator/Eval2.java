package jungol.Operator;

import java.util.Scanner;

public class Eval2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int res = num1/num2;
        int remainder = num1%num2;

        System.out.printf("%d / %d = %d...%d", num1, num2, res, remainder);
    }
}
