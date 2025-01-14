package jungol.Loops3;

import java.util.Scanner;

// again!!
public class Assess2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // row = 5 (input)
        // col = 5 (input)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
