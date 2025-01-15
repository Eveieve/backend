package jungol.Loops3;

import java.util.Scanner;

public class Assess6_class {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        char ch = 'A';

        for(int row =0; row<n; row++) {
            for(int col = 0; col< n-row; col++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
