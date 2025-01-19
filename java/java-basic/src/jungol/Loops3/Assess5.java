package jungol.Loops3;

import java.util.Scanner;
// again!

public class Assess5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 3 row, 5 col
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("A");// row 0: 0space, row1: 1space
            }
            // for any given row i
            // n-i represents how far the current row is from the bottom of the pyramid. The farther from the bottom, the more stars are present.
            for (int k = 0; k < 2 * (n - i) - 1; k++) { // stars decrease with each row. Stars decreases by 2 for each row
                System.out.print("*");// n=3,row0, 5 stars, row1: 3 stars, row2 : 1star
            }
            System.out.println();
        }
    }
}
