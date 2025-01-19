package jungol.Loops3;

import java.util.Scanner;

public class Assess7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char ch = 'A';
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(cnt++ + " ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}
