package jungol.Loops3;

import java.util.Scanner;

public class Assess4_class {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int row =0; row <n ; row++) {
            for(int column =0; column <= row; column++){
                System.out.println(" ");
            }
            for(int star =0; star<n -row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
