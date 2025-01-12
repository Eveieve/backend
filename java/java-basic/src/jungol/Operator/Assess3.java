package jungol.Operator;

import java.util.Scanner;

public class Assess3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        int res1 = num1++;
        int res2 = ++num1;
        System.out.println(res1);
        System.out.println(res2);
    }



}
