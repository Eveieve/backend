package jungol.Loops3;

import java.util.Scanner;
// not passed
public class Eval3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");

                if (j == i) {
                    for (int k = i; k >=1; k--)
                        System.out.printf("*\n");
                }
            }


            System.out.println();

        }
    }
}
