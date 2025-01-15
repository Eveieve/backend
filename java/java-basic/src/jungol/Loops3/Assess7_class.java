package jungol.Loops3;

import java.util.Scanner;

public class Assess7_class {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        char ch = 'A';
        int number = 1;

        for (int row = 0; row < n; row++) {
            for (int i = 0; i < n - row; i++) {
                System.out.print(number++ + " ");
            }
            for (int c = 0; c < row + 1; c++) { //문자블럭
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}
